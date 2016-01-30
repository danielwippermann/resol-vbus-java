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

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * A `HeaderSet` works like a `java.util.Set<Header>` with some extra methods.
 * If a `Header` object is added to a `HeaderSet` an older version of the `Header`
 * is removed before the new one is added. 
 */
public class HeaderSet<T extends Header> {

	protected long timestamp;
	
	protected ArrayList<T> headerList;
	
	protected ArrayList<HeaderSetListener<T>> listeners;

	/**
	 * Creates an empty `HeaderSet`, initializing the timestamp to the given value.
	 * 
	 * @param timestamp Timestamp of this header set, in milliseconds since UNIX epoch.
	 */
	public HeaderSet(long timestamp) {
		this.timestamp = timestamp;
		this.headerList = new ArrayList<T>();
		listeners = new ArrayList<HeaderSetListener<T>>();
	}

	/**
	 * Creates a `HeaderSet` instance, populating it with the `Header`
	 *  instances given and setting its timestamp.
	 * 
	 * @param timestamp Timestamp of this header set, in milliseconds since UNIX epoch.
	 * @param headers `Header` instances to add to the header set.
	 */
	public HeaderSet(long timestamp, T... headers) {
		this(timestamp);
		
		for (T header : headers) {
			addHeader(header);
		}
		
		// NOTE(daniel): set timestamp again since it was possibly altered by `addHeader`
		this.timestamp = timestamp;
	}
	
	/**
	 * Creates a `HeaderSet` instance, populating it with the `Header`
	 * instances returned by the given iterator and setting its timestamp.
	 * 
	 * @param timestamp Timestamp of this header set, in milliseconds since UNIX epoch.
	 * @param headers Iterator of `Header` objects to add to this header set.
	 */
	public HeaderSet(long timestamp, Iterator<T> headers) {
		this(timestamp);
				
		while (headers.hasNext()) {
			addHeader(headers.next());
		}
		
		// NOTE(daniel): set timestamp again since it was possibly altered by `addHeader`
		this.timestamp = timestamp;
	}
	
	/**
	 * Get the current timestamp of the header set.
	 * 
	 * @return Current timestamp of the header set.
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Set the current timestamp of the header set.
	 * 
	 * @param timestamp Current timestamp of the header set.
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * Add a listener that fired every time a `Header` is added to this header set.
	 * 
	 * @param listener Listener
	 */
	public void addListener(HeaderSetListener<T> listener) {
		listeners.add(listener);
	}
	
	/**
	 * Remove a previously added listener.
	 * 
	 * @param listener Listener
	 */
	public void removeListener(HeaderSetListener<T> listener) {
		listeners.remove(listener);
	}

	private int findIndex(T header) {
		int result = -1;
		for (int i = 0; i < headerList.size(); i++) {
			if (headerList.get(i).compareTo(header) == 0) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	/**
	 * Checks whether the header set contains a `Header` like the one given.
	 * 
	 * @param header The `Header` to search for.
	 * @return `true` if a `Header` like the one given was found, `false` otherwise.
	 */
	public boolean containsHeader(T header) {
		return (findIndex(header) >= 0);
	}
	
	/**
	 * Add a `Header` instance to this header set.
	 * 
	 * @param header Header to add to this header set.
	 */
	public void addHeader(T header) {
		int index = findIndex(header);
		if (index >= 0) {
			headerList.set(index, header);
		} else {
			headerList.add(header);
		}
		
		if (this.timestamp < header.timestamp) {
			this.timestamp = header.timestamp;
		}
		
		for (HeaderSetListener<T> listener : listeners) {
			listener.headerAdded(this, header);
		}
	}
	
	/**
	 * Add multiple `Header` instances to this header set.
	 * 
	 * @param headers `Header` instances to add to this header set.
	 */
	public void addHeaders(T... headers) {
		for (T header : headers) {
			addHeader(header);
		}
	}
	
	private void removeHeader(int index) {
		headerList.remove(index);
	}

	/**
	 * Remove all `Header` instances from this header set.
	 */
	public void removeAllHeaders() {
		while (headerList.size() > 0) {
			removeHeader(headerList.size() - 1);
		}
	}
	
	/**
	 * Remove all `Header` instances from this header set that are older than the given timestamp.
	 * 
	 * @param timestamp Timestamp to check `Header` instances against.
	 */
	public void removeHeadersOlderThan(long timestamp) {
		int index = headerList.size() - 1;
		while (index >= 0) {
			if (headerList.get(index).timestamp < timestamp) {
				removeHeader(index);
			}
			index--;
		}
	}

	/**
	 * Get number of unique `Header` instances in this header set.
	 * 
	 * @return Number of unique `Header` instances in this header set.
	 */
	public int getHeaderCount() {
		return headerList.size();
	}
	
	/**
	 * Get iterator for all unique `Header` instances in this header set.
	 * 
	 * @return Iterator for all unique `Header` instances in this header set.
	 */
	public Iterator<T> getHeaderIterator() {
		return headerList.iterator();
	}
	
	/**
	 * Populate array with all unique `Header` instances in this header set.
	 * 
	 * @param array Array to populate.
	 * @return Populated array.
	 */
	public T[] getHeaders(T[] array) {
		return headerList.toArray(array);
	}
	
	private ArrayList<T> getSortedHeaderList() {
		ArrayList<T> sortedHeaderList = new ArrayList<T>(headerList);
		sortedHeaderList.sort(new Comparator<T>() {
			
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
			
		});
		return sortedHeaderList;
	}
	
	/**
	 * Get list iterator for sorted list of all unique `Header` instances in this header set.
	 * 
	 * @return List iterator for sorted list of all unique `Header` instances in this header set.
	 */
	public ListIterator<T> getSortedHeaderListIterator() {
		return getSortedHeaderList().listIterator();
	}
	
	/**
	 * Populate array with sorted list of all unique `Header` instances in this header set.
	 * 
	 * @param array Array to populate.
	 * @return Populated array.
	 */
	public T[] getSortedHeaders(T[] array) {
		return getSortedHeaderList().toArray(array);
	}

	/**
	 * Get `HeaderSet` instance that contains a sorted list of all unique `Header` instances in this header set.
	 * 
	 * @return `HeaderSet` instance that contains a sorted list of all unique `Header` instances in this header set.
	 */
	public HeaderSet<T> getSortedHeaderSet() {
		ArrayList<T> sortedHeaderList = getSortedHeaderList();
		return new HeaderSet<T>(timestamp, sortedHeaderList.listIterator());
	}

	/**
	 * Get the ID of this header set.
	 * 
	 * A sorted list of the unique `Header` instances in this header set is
	 * created and the IDs of those `Header` instances are joined by a comma
	 * to form a unqiue ID for this header set.
	 * 
	 * @return ID of this header set.
	 */
	public String getId() {
		ArrayList<T> sortedHeaderList = getSortedHeaderList();
		StringBuilder sb = new StringBuilder();
		for (T header : sortedHeaderList) {
			if (sb.length() > 0) {
				sb.append(',');
			}
			sb.append(header.getId());
		}
		return sb.toString();
	}
	
	/**
	 * Get the ID hash of this header set.
	 * 
	 * The ID hash is a SHA-256 digest of the ID of the header set.
	 * 
	 * @return ID hash of this header set.
	 */
	public String getIdHash() {
		try {
			String id = getId();
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(id.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String idHash = String.format("%064x", new BigInteger(1, digest));
			return idHash;
		} catch (NoSuchAlgorithmException ex) {
			// NOTE(daniel): Assuming SHA-256 is always supported.
			throw new RuntimeException(ex);
		} catch (UnsupportedEncodingException ex) {
			// NOTE(daniel): Assuming UTF-8 is always supported.
			throw new RuntimeException(ex);
		}
	}

}
