/**
 * Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.
 * Copyright (C) 2016, Daniel Wippermann.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
package de.resol.vbus;

import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * The `HeaderSetConsolidator` class extends the `HeaderSet` class by adding
 * several features that allow filtering and sieving of `HeaderSet` instances.
 * 
 * The `processHeaderSet` method of the `HeaderSetConsolidator` class fires an
 * additional listener method `headerSetProcessed` if:
 * 
 * - the timestamp of the `HeaderSetConsolidator` is within the range between
 *   `minTimestamp` and `maxTimestamp`, and
 * - the `headerSetProcessed` listener method has not yet been called for this
 *   `sieveInterval`.
 * 
 * If both conditions are met, the listener method is called after old / dead
 * `Header` instances in the `HeaderSetConsolidator` were removed (if a
 * `timeToLive` is given).
 * 
 * The `processHeaderSet` method can be called in two ways:
 * 
 * - manually be the application developer
 * - on a regular basis using a timer
 * 
 * Manually calling the `processHeaderSet` method allows filtered of non-
 * realtime `HeaderSet` instances (e.g. if they are reconstructed from a
 * file). Calling the method using a timer allows filtering of live
 * data (e.g. if they are received from a VBus connection).
 */
public class HeaderSetConsolidator<T extends Header> extends HeaderSet<T> {

	protected static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	protected long minTimestamp;
	
	protected long maxTimestamp;
	
	protected int sieveInterval;
	
	protected int timeToLive;
	
	protected long lastTimerTimestamp;
	
	protected long lastSieveTimestamp;

	protected ScheduledFuture<?> future;
	
	/**
	 * Creates a `HeaderSetConsolidator`, initializing its members to the given values.
	 * 
	 * @param timestamp Timestamp of this header set.
	 * @param minTimestamp Minimum timestamp to accept header sets for.
	 * @param maxTimestamp Maximum timestamp to accept header sets for.
	 * @param sieveInterval Sieve interval in milliseconds.
	 * @param timeToLive Time to live in milliseconds.
	 */
	public HeaderSetConsolidator(long timestamp, long minTimestamp, long maxTimestamp, int sieveInterval, int timeToLive) {
		super(timestamp);
		this.minTimestamp = minTimestamp;
		this.maxTimestamp = maxTimestamp;
		this.sieveInterval = sieveInterval;
		this.timeToLive = timeToLive;
	}
	
	/**
	 * Start a timer that repeatedly calls `processHeaderSet` in the given interval.
	 * 
	 * @param interval Interval in milliseconds.
	 */
	public void startTimer(final int interval) {
		final HeaderSetConsolidator<T> that = this;

		stopTimer();

		this.lastTimerTimestamp = System.currentTimeMillis();

		Runnable command = new Runnable() {
			
			public void run() {
				try {
					that.handleTimerInterval(interval);
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		};
		
		int futureInterval = Math.min(interval / 2, 500);

		future = scheduler.scheduleAtFixedRate(command, 0, futureInterval, TimeUnit.MILLISECONDS);
	}
	
	/**
	 * Stop the time that was started by `startTimer`.
	 */
	public void stopTimer() {
		if (future != null) {
			future.cancel(true);
			future = null;
		}
	}
	
	/**
	 * Process the `HeaderSet` given. All unique `Header` instances from that
	 * `HeaderSet` are added to this `HeaderSetConsolidator` before evaluating
	 * whether or not the `headerSetProcessed` listener method should be
	 * called.
	 * 
	 * @param headerSet `HeaderSet` to add `Header` instances from.
	 */
	public void processHeaderSet(HeaderSet<T> headerSet) {
		long timestamp = headerSet.timestamp;
		
		Iterator<T> headerIterator = headerSet.getHeaderIterator();
		while (headerIterator.hasNext()) {
			this.addHeader(headerIterator.next());
		}
		
		processHeaderSetInternal(timestamp);
	}
	
	private void handleTimerInterval(int interval) {
		long timestamp = System.currentTimeMillis();
		
		long lastInterval = lastTimerTimestamp / interval;
		long currentInterval = timestamp / interval;
		long diff = currentInterval - lastInterval;
		
		boolean include = ((diff < -1) || (diff > 0));
		
		if (include) {
			processHeaderSetInternal(timestamp);
			
			lastTimerTimestamp = timestamp;
		}
	}
	
	private void processHeaderSetInternal(long timestamp) {
		boolean include;
		if (timestamp < minTimestamp) {
			include = false;
		} else if (timestamp > maxTimestamp) {
			include = false;
		} else if (sieveInterval <= 0) {
			include = true;
		} else {
			long lastInterval = lastSieveTimestamp / sieveInterval;
			long currentInterval = timestamp / sieveInterval;
			long diff = currentInterval - lastInterval;
			
			include = ((diff < -1) || (diff > 0));
		}
		
		if (timeToLive > 0) {
			removeHeadersOlderThan(timestamp - timeToLive);
		}
		
		if (include) {
			this.timestamp = timestamp;
			
			for (HeaderSetListener<T> listener : listeners) {
				if (listener instanceof HeaderSetConsolidatorListener<?>) {
					HeaderSetConsolidatorListener<T> hscListener = (HeaderSetConsolidatorListener<T>) listener;
					hscListener.headerSetProcessed(this);
				}
			}
			
			lastSieveTimestamp = timestamp;
		}
	}

}
