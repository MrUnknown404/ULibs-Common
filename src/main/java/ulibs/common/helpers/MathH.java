package main.java.ulibs.common.helpers;

import java.util.Random;

import main.java.ulibs.common.utils.Console;

//TODO write the javadocs for all the math
/** A bunch of utility methods involving Math
 * @author -Unknown-
 */
public class MathH {
	/** @see Random */
	public static final Random RANDOM = new Random();
	
	/** @return Returns a random {@link Boolean} */
	public static boolean randomBoolean() {
		return RANDOM.nextBoolean();
	}
	
	/**
	 * @param max The maximum number to return
	 * @return Returns a random {@link Integer} between 0 & max - 1
	 * @see Random#nextInt(int)
	 */
	public static int randomInt(int max) {
		return RANDOM.nextInt(max);
	}
	
	/**
	 * @param value The value to round
	 * @return Returns the given {@link Double} rounded down to the nearest {@link Integer} */
	public static int floor(double value) {
		int i = (int) value;
		return value < i ? i - 1 : i;
	}
	
	/**
	 * @param value The value to round
	 * @return Returns the given {@link Float} rounded down to the nearest {@link Integer} */
	public static int floor(float value) {
		int i = (int) value;
		return value < i ? i - 1 : i;
	}
	
	/**
	 * @param value The value to round
	 * @return Takes the given {@link Double} rounded up to the nearest {@link Integer} */
	public static int ceil(double value) {
		int i = (int) value;
		return value > i ? i + 1 : i;
	}
	
	/**
	 * @param value The value to round
	 * @return Takes the given {@link Float} rounded up to the nearest {@link Integer} */
	public static int ceil(float value) {
		int i = (int) value;
		return value > i ? i + 1 : i;
	}
	
	/**
	 * @param num The number to use
	 * @param min The minimum value to allow
	 * @param max The maximum value to allow
	 * @return The given number between the min & max values given
	 */
	public static double clamp(double num, double min, double max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	/**
	 * @param num The number to use
	 * @param min The minimum value to allow
	 * @param max The maximum value to allow
	 * @return The given number between the min & max values given
	 */
	public static float clamp(float num, float min, float max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	/**
	 * @param num The number to use
	 * @param min The minimum value to allow
	 * @param max The maximum value to allow
	 * @return The given number between the min & max values given
	 */
	public static int clamp(int num, int min, int max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	/**
	 * @param num The number to use
	 * @param min The minimum value to allow
	 * @param max The maximum value to allow
	 * @return The given number between the min & max values given
	 */
	public static long clamp(long num, long min, long max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	/**
	 * @param number The number to round
	 * @param decimal The decimal to round to
	 * @return The given number round to the given decimal
	 */
	public static double roundTo(double number, int decimal) {
		double tempDecimal = Math.pow(10, decimal);
		return Math.round(number * tempDecimal) / tempDecimal;
	}
	
	/**
	 * @param number The number to round
	 * @param decimal The decimal to round to
	 * @return The given number round to the given decimal
	 */
	public static float roundTo(float number, int decimal) {
		float tempDecimal = (float) Math.pow(10, decimal);
		return Math.round(number * tempDecimal) / tempDecimal;
	}
	
	/**
	 * @param number The number to use
	 * @param min The minimum possible number
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-1 scale based off the given minimum & maximum number
	 */
	public static double normalize(double number, double min, double max) {
		if (number > max) {
			Console.print(Console.WarningType.Error, "the specified number is more than the specified max!", new Exception());
			return max;
		} else if (number < min) {
			Console.print(Console.WarningType.Error, "the specified number cannot be less than the specified min!", new Exception());
			return 0;
		}
		
		return (number - min) / (max - min);
	}
	
	/**
	 * @param number The number to use
	 * @param min The minimum possible number
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-1 scale based off the given minimum & maximum number
	 */
	public static float normalize(float number, float min, float max) {
		if (number > max) {
			Console.print(Console.WarningType.Error, "the specified number is more than the specified max!", new Exception());
			return max;
		} else if (number < min) {
			Console.print(Console.WarningType.Error, "the specified number cannot be less than the specified min!", new Exception());
			return 0;
		}
		
		return (number - min) / (max - min);
	}
	
	/**
	 * @param number The number to use
	 * @param min The minimum possible number
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-1 scale based off the given minimum & maximum number
	 */
	public static float normalize(int number, int min, int max) {
		if (number > max) {
			Console.print(Console.WarningType.Error, "the specified number is more than the specified max!", new Exception());
			return max;
		} else if (number < min) {
			Console.print(Console.WarningType.Error, "the specified number cannot be less than the specified min!", new Exception());
			return 0;
		}
		
		return (float) (number - min) / (float) (max - min);
	}
	
	/**
	 * @param number The number to use
	 * @param min The minimum possible number
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-1 scale based off the given minimum & maximum number
	 */
	public static double normalize(long number, long min, long max) {
		if (number > max) {
			Console.print(Console.WarningType.Error, "the specified number is more than the specified max!", new Exception());
			return max;
		} else if (number < min) {
			Console.print(Console.WarningType.Error, "the specified number cannot be less than the specified min!", new Exception());
			return 0;
		}
		
		return (double) (number - min) / (double) (max - min);
	}
	
	/**
	 * @param number The number to use
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-100 scale based off the given maximum number. Assumes the minimum is 0
	 */
	public static double percentage(double number, double max) {
		return (number / max) * 100;
	}
	
	/**
	 * @param number The number to use
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-100 scale based off the given maximum number. Assumes the minimum is 0
	 */
	public static float percentage(float number, float max) {
		return (number / max) * 100f;
	}
	
	/**
	 * @param number The number to use
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-100 scale based off the given maximum number. Assumes the minimum is 0
	 */
	public static float percentage(int number, int max) {
		return ((float) number / (float) max) * 100f;
	}
	
	/**
	 * @param number The number to use
	 * @param max The maximum possible number
	 * @return Takes the given number and returns it in a 0-100 scale based off the given maximum number. Assumes the minimum is 0
	 */
	public static double percentage(long number, long max) {
		return ((double) number / (double) max) * 100d;
	}
	
	/**
	 * @param value The number to use
	 * @param min The minimum number
	 * @param max The maximum number
	 * @return True if given number is within the given minimum & maximum. Otherwise false. <br> {@code value >= min && value <= max}
	 */
	public static boolean within(double value, double min, double max) {
		return value >= min && value <= max;
	}
	
	/**
	 * @param value The number to use
	 * @param min The minimum number
	 * @param max The maximum number
	 * @return True if given number is within the given minimum & maximum. Otherwise false. <br> {@code value >= min && value <= max}
	 */
	public static boolean within(float value, float min, float max) {
		return value >= min && value <= max;
	}
	
	/**
	 * @param value The number to use
	 * @param min The minimum number
	 * @param max The maximum number
	 * @return True if given number is within the given minimum & maximum. Otherwise false. <br> {@code value >= min && value <= max}
	 */
	public static boolean within(int value, int min, int max) {
		return value >= min && value <= max;
	}
	
	/**
	 * @param value The number to use
	 * @param min The minimum number
	 * @param max The maximum number
	 * @return True if given number is within the given minimum & maximum. Otherwise false. <br> {@code value >= min && value <= max}
	 */
	public static boolean within(long value, long min, long max) {
		return value >= min && value <= max;
	}
}
