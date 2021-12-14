package main.java.ulibs.common.helpers;

import java.nio.ByteBuffer;

import main.java.ulibs.common.utils.exceptions.ByteException;
import main.java.ulibs.common.utils.exceptions.ByteException.Reason;

/**
 * Simple class used for converting objects into bytes and bytes into objects
 * @author -Unknown-
 */
public class ByteH {
	/**
	 * @param bytes The bytes to get an int from. The array should only be 4 long as Integers are only 4 bytes
	 * @return Returns an Integer from the bytes
	 * @throws ByteException Thrown if the given bytes size does not equal 4
	 * @see Integer
	 * @see Byte
	 */
	public static int getInt(byte[] bytes) throws ByteException {
		if (bytes.length != 4) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getInt();
	}
	
	/**
	 * @param data The int to turn into bytes
	 * @return Returns a byte array that's always 4 long
	 * @see Integer
	 * @see Byte
	 */
	public static byte[] getBytes(int data) {
		return ByteBuffer.allocate(4).putInt(data).array();
	}
	
	/**
	 * @param bytes The bytes to get a float from. The array should only be 4 long as floats are only 4 bytes
	 * @return Returns an float from the bytes
	 * @throws ByteException Thrown if the given bytes size does not equal 4
	 * @see Float
	 * @see Byte
	 */
	public static float getFloat(byte[] bytes) throws ByteException {
		if (bytes.length != 4) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getFloat();
	}
	
	/**
	 * @param data The float to turn into bytes
	 * @return Returns a byte array that's always 4 long
	 * @see Float
	 * @see Byte
	 */
	public static byte[] getBytes(float data) {
		return ByteBuffer.allocate(4).putFloat(data).array();
	}
	
	/**
	 * @param bytes The bytes to get a double from. The array should only be 8 long as doubles are only 8 bytes
	 * @return Returns an double from the bytes
	 * @throws ByteException Thrown if the given bytes size does not equal 8
	 * @see Double
	 * @see Byte
	 */
	public static double getDouble(byte[] bytes) throws ByteException {
		if (bytes.length != 8) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getDouble();
	}
	
	/**
	 * @param data The double to turn into bytes
	 * @return Returns a byte array that's always 8 long
	 * @see Double
	 * @see Byte
	 */
	public static byte[] getBytes(double data) {
		return ByteBuffer.allocate(8).putDouble(data).array();
	}
	
	/**
	 * @param bytes The bytes to get a short from. The array should only be 4 long as shorts are only 2 bytes
	 * @return Returns an short from the bytes
	 * @throws ByteException Thrown if the given bytes size does not equal 2
	 * @see Short
	 * @see Byte
	 */
	public static short getShort(byte[] bytes) throws ByteException {
		if (bytes.length != 2) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getShort();
	}
	
	/**
	 * @param data The short to turn into bytes
	 * @return Returns a byte array that's always 2 long
	 * @see Short
	 * @see Byte
	 */
	public static byte[] getBytes(short data) {
		return ByteBuffer.allocate(2).putShort(data).array();
	}
	
	/**
	 * @param bytes The bytes to get a string from.
	 * @return Returns a string from the given bytes. Casting each byte into a character
	 * @see Byte
	 * @see String
	 * @see Character
	 */
	public static String getString(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append((char) b);
		}
		return sb.toString();
	}
	
	/**
	 * @param data The string to convert into bytes
	 * @return Returns a byte array with the same size as the given string. Casting each character of the string into a byte
	 * @see Byte
	 * @see String
	 * @see Character
	 */
	public static byte[] getBytes(String data) {
		byte[] bytes = new byte[data.length()];
		char[] chars = data.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			bytes[i] = (byte) chars[i];
		}
		
		return bytes;
	}
	
	/**
	 * @param bytes The bytes to get a long from. The array should only be 8 long as Longs are only 8 bytes
	 * @return Returns a Long from the bytes
	 * @throws ByteException Thrown if the given bytes size does not equal 8
	 * @see Long
	 * @see Byte
	 */
	public static long getLong(byte[] bytes) throws ByteException {
		if (bytes.length != 8) {
			throw new ByteException(Reason.wrong_size);
		}
		
		return ByteBuffer.wrap(bytes).getLong();
	}
	
	/**
	 * @param data The long to turn into bytes
	 * @return Returns a byte array that's always 8 long
	 * @see Long
	 * @see Byte
	 */
	public static byte[] getBytes(long data) {
		return ByteBuffer.allocate(8).putLong(data).array();
	}
	
	/** Combines all the given bytes into a singular byte array
	 * @param b1 Byte 1
	 * @param b2 Byte 2
	 * @param b3 Byte 3+ (Optional)
	 * @return A single byte array with the contents of all the provided bytes
	 */
	public static byte[] combineBytes(byte b1, byte b2, byte... b3) {
		ByteBuffer buff = ByteBuffer.wrap(new byte[2 + b3.length]);
		buff.put(b1);
		buff.put(b2);
		for (byte b : b3) {
			buff.put(b);
		}
		
		return buff.array();
	}
	
	/** Combines all the given byte arrays into a singular byte array
	 * @param b1 Array 1
	 * @param b2 Array 2
	 * @param b3 Array 3+ (Optional)
	 * @return A single byte array with the contents of all the provided arrays
	 */
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
