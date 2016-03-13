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

public class ConfigurationValue implements Cloneable {

	private String valueId;
	
	private int valueIndex;
	
	private int valueIdHash;
	
	private int value;

	private int priority;

	private boolean isPending;
	
	private boolean isTransceived;

	public ConfigurationValue(String valueId, int valueIndex, int valueIdHash, int value, int priority, boolean isPending, boolean isTransceived) {
		this.valueId = valueId;
		this.valueIndex = valueIndex;
		this.valueIdHash = valueIdHash;
		this.value = value;
		this.priority = priority;
		this.isPending = isPending;
		this.isTransceived = isTransceived;
	}
	
	public String getValueId() {
		return valueId;
	}
	
	public void setValueId(String valueId) {
		this.valueId = valueId;
	}
	
	public int getValueIndex() {
		return valueIndex;
	}
	
	public void setValueIndex(int valueIndex) {
		this.valueIndex = valueIndex;
	}
	
	public int getValueIdHash() {
		return valueIdHash;
	}
	
	public void setValueIdHash(int valueIdHash) {
		this.valueIdHash = valueIdHash;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public boolean isPending() {
		return isPending;
	}
	
	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}
	
	public boolean isTransceived() {
		return isTransceived;
	}
	
	public void setTransceived(boolean isTransceived) {
		this.isTransceived = isTransceived;
	}
	
	public static int hashValueId(String valueId) {
		int hash = 0;
		if (valueId != null) {
			for (int index = 0; index < valueId.length(); index++) {
				hash = ((hash * 0x21) + valueId.codePointAt(index)) & 0x7FFFFFFF;
			}
		}
		return hash;
	}
	
	@Override
	public ConfigurationValue clone() {
		try {
			return ((ConfigurationValue) super.clone());
		} catch (CloneNotSupportedException ex) {
			// NOTE(daniel): should not happen since it is clonable
			throw new Error(ex);
		}
	}
	
}
