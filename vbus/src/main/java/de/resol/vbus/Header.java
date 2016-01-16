package de.resol.vbus;

public abstract class Header implements Comparable<Header>{

	protected long timestamp;
	
	protected int channel;
	
	protected int destinationAddress;
	
	protected int sourceAddress;
	
	protected Header() {
		timestamp = System.currentTimeMillis();
		channel = 0;
		destinationAddress = 0;
		sourceAddress = 0;
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getDestinationAddress() {
		return destinationAddress;
	}
	
	public int getSourceAddress() {
		return sourceAddress;
	}

	public abstract int getProtocolVersion();
	
	public abstract byte[] toLiveBuffer();
	
	public int getInfo() {
		return 0;
	}
	
	public String getId() {
		return String.format("%02X_%04X_%04X_%02X", channel, destinationAddress, sourceAddress, getProtocolVersion());
	}
	
	public int compareTo(Header that) {
		int result = this.channel - that.channel;
		if (result == 0) {
			result = this.destinationAddress - that.destinationAddress;
		}
		if (result == 0) {
			result = this.sourceAddress - that.sourceAddress;
		}
		if (result == 0) {
			result = this.getProtocolVersion() - that.getProtocolVersion();
		}
		return result;
	}

	public static byte calcChecksumV0(byte[] buffer, int start, int length) {
		byte checksum = 0;
		for (int i = 0; i < length; i++) {
			checksum = (byte) (checksum + buffer [start + i]);
		}
		checksum = (byte) ((0xFF - checksum) & 0x7F); 
		return checksum;
	}
	
	public static boolean calcAndCompareChecksumV0(byte[] buffer, int start, int length) {
		byte checksum = calcChecksumV0(buffer, start, length);
		return (buffer [start + length] == checksum);
	}
	
	public static byte calcAndSetChecksumV0(byte[] buffer, int start, int length) {
		byte checksum = calcChecksumV0(buffer, start, length);
		buffer [start + length] = checksum;
		return checksum;
	}
	
	public static void injectSeptett(byte[] srcBuffer, int srcStart, int length, byte[] dstBuffer, int dstStart) {
		int srcIndex = srcStart, dstIndex = dstStart, mask = 1, septett = srcBuffer [srcStart + length];
		for (int i = 0; i < length; i++) {
			byte b = srcBuffer [srcIndex];
			if ((septett & mask) != 0) {
				b |= 0x80;
			}
			dstBuffer [dstIndex] = b;
			
			srcIndex++;
			dstIndex++;
			mask = mask << 1;
		}
	}
	
	public static void extractSeptett(byte[] srcBuffer, int srcStart, int length, byte[] dstBuffer, int dstStart) {
		int srcIndex = srcStart, dstIndex = dstStart, mask = 1, septett = 0;
		for (int i = 0; i < length; i++) {
			byte b = srcBuffer [srcIndex];
			if ((b & 0x80) != 0) {
				b &= 0x7F;
				septett |= mask;
			}
			dstBuffer [dstIndex] = b;

			srcIndex++;
			dstIndex++;
			mask = mask << 1;
		}
		
		dstBuffer [dstIndex] = (byte) septett;
	}
	
}
