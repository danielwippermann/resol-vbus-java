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

public class HeaderSetConsolidator<T extends Header> extends HeaderSet<T> {

	protected static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	protected long minTimestamp;
	
	protected long maxTimestamp;
	
	protected int sieveInterval;
	
	protected int timeToLive;
	
	protected long lastIntervalTimestamp;
	
	protected ScheduledFuture<?> future;
	
	public HeaderSetConsolidator(long timestamp, long minTimestamp, long maxTimestamp, int sieveInterval, int timeToLive) {
		super(timestamp);
		this.minTimestamp = minTimestamp;
		this.maxTimestamp = maxTimestamp;
		this.sieveInterval = sieveInterval;
		this.timeToLive = timeToLive;
	}
	
	public void startTimer(int interval) {
		final HeaderSetConsolidator<T> that = this;

		stopTimer();

		this.lastIntervalTimestamp = System.currentTimeMillis();

		Runnable command = new Runnable() {
			
			public void run() {
				that.handleInterval();
			}
		};
		
		int futureInterval = Math.min(interval, 500);

		future = scheduler.scheduleAtFixedRate(command, 0, futureInterval, TimeUnit.MILLISECONDS);
	}
	
	public void stopTimer() {
		if (future != null) {
			future.cancel(true);
			future = null;
		}
	}
	
	public void processHeaderSet(HeaderSet<T> headerSet) {
		long timestamp = headerSet.timestamp;
		
		Iterator<T> headerIterator = headerSet.getHeaderIterator();
		while (headerIterator.hasNext()) {
			this.addHeader(headerIterator.next());
		}
		
		processHeaderSetInternal(timestamp);
	}
	
	private void handleInterval() {
		long timestamp = System.currentTimeMillis();
		
		processHeaderSetInternal(timestamp);
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
			long lastInterval = lastIntervalTimestamp / sieveInterval;
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
					hscListener.onHeaderSetProcessed(this);
				}
			}
			
			lastIntervalTimestamp = timestamp;
		}
	}

}
