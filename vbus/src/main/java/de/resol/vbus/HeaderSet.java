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

public class HeaderSet<T extends Header> {

	protected long timestamp;
	
	protected ArrayList<T> headerList;
	
	protected ArrayList<HeaderSetListener<T>> listeners;
	
	public HeaderSet(long timestamp) {
		this.timestamp = timestamp;
		this.headerList = new ArrayList<T>();
		listeners = new ArrayList<HeaderSetListener<T>>();
	}
	
	public HeaderSet(long timestamp, T... headers) {
		this(timestamp);
		
		for (T header : headers) {
			addHeader(header);
		}
		
		// NOTE(daniel): set timestamp again since it was possibly altered by `addHeader`
		this.timestamp = timestamp;
	}
	
	public HeaderSet(long timestamp, Iterator<T> headers) {
		this(timestamp);
				
		while (headers.hasNext()) {
			addHeader(headers.next());
		}
		
		// NOTE(daniel): set timestamp again since it was possibly altered by `addHeader`
		this.timestamp = timestamp;
	}
	
	public void addListener(HeaderSetListener<T> listener) {
		listeners.add(listener);
	}
	
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
	
	public boolean containsHeader(T header) {
		return (findIndex(header) >= 0);
	}
	
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
	
	public void addHeaders(T... headers) {
		for (T header : headers) {
			addHeader(header);
		}
	}
	
	private void removeHeader(int index) {
		headerList.remove(index);
	}

	public void removeAllHeaders() {
		while (headerList.size() > 0) {
			removeHeader(headerList.size() - 1);
		}
	}
	
	public void removeHeadersOlderThan(long timestamp) {
		int index = headerList.size() - 1;
		while (index >= 0) {
			if (headerList.get(index).timestamp < timestamp) {
				removeHeader(index);
			}
			index--;
		}
	}

	public int getHeaderCount() {
		return headerList.size();
	}
	
	public Iterator<T> getHeaderIterator() {
		return headerList.iterator();
	}
	
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
	
	public ListIterator<T> getSortedHeaderListIterator() {
		return getSortedHeaderList().listIterator();
	}
	
	public T[] getSortedHeaders(T[] array) {
		return getSortedHeaderList().toArray(array);
	}

	public HeaderSet<T> getSortedHeaderSet() {
		ArrayList<T> sortedHeaderList = getSortedHeaderList();
		return new HeaderSet<T>(timestamp, sortedHeaderList.listIterator());
	}

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
