package main.java.ulibs.common.helpers;

import java.nio.ByteBuffer;

import main.java.ulibs.common.utils.exceptions.ByteException;
import main.java.ulibs.common.utils.exceptions.ByteException.Reason;

public class ByteH {
	public static int getInt(byte[] bytes) throws ByteException {
		if (bytes.length != 4) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getInt();
	}
	
	public static byte[] getBytes(int data) {
		return ByteBuffer.allocate(4).putInt(data).array();
	}
	
	public static float getFloat(byte[] bytes) throws ByteException {
		if (bytes.length != 4) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getFloat();
	}
	
	public static byte[] getBytes(float data) {
		return ByteBuffer.allocate(4).putFloat(data).array();
	}
	
	public static short getShort(byte[] bytes) throws ByteException {
		if (bytes.length != 2) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getShort();
	}
	
	public static byte[] getBytes(short data) {
		return ByteBuffer.allocate(2).putShort(data).array();
	}
	
	public static byte[] combineBytes(byte b1, byte b2, byte... b3) {
		ByteBuffer buff = ByteBuffer.wrap(new byte[2 + b3.length]);
		buff.put(b1);
		buff.put(b2);
		for (byte b : b3) {
			buff.put(b);
		}
		
		return buff.array();
	}
	
	public static byte[] combineBytes(byte[] b1, byte[] b2, byte[]... b3) {
		int size = b1.length + b2.length;
		for (byte[] b : b3) {
			size += b.length;
		}
		
		ByteBuffer buff = ByteBuffer.wrap(new byte[size]);
		buff.put(b1);
		buff.put(b2);
		for (byte[] b : b3) {
			buff.put(b);
		}
		
		return buff.array();
	}
}
