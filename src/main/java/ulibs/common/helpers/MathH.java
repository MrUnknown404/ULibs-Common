package main.java.ulibs.common.helpers;

import java.math.BigDecimal;
import java.util.Random;

import main.java.ulibs.common.utils.Console;

@SuppressWarnings("javadoc") //TODO write the javadocs for all the math
public class MathH {
	public static final Random RANDOM = new Random();
	
	public static int floor(double value) {
		int i = (int) value;
		return value < i ? i - 1 : i;
	}
	
	public static int floor(float value) {
		int i = (int) value;
		return value < i ? i - 1 : i;
	}
	
	public static int ceil(double value) {
		int i = (int) value;
		return value > i ? i + 1 : i;
	}
	
	public static int ceil(float value) {
		int i = (int) value;
		return value > i ? i + 1 : i;
	}
	
	public static double clamp(double num, double min, double max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	public static float clamp(float num, float min, float max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	public static int clamp(int num, int min, int max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	public static long clamp(long num, long min, long max) {
		return num < min ? min : (num > max ? max : num);
	}
	
	public static double roundTo(double number, int decimal) {
		double tempDecimal = Math.pow(10, decimal);
		return Math.round(number * tempDecimal) / tempDecimal;
	}
	
	public static float roundTo(float number, int decimal) {
		float tempDecimal = (float) Math.pow(10, decimal);
		return Math.round(number * tempDecimal) / tempDecimal;
	}
	
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
	
	public static float normalize(int number, int min, int max) {
		if (number > max) {
			Console.print(Console.WarningType.Error, "the specified number is more than the specified max!", new Exception());
			return max;
		} else if (number < min) {
			Console.print(Console.WarningType.Error, "the specified number cannot be less than the specified min!", new Exception());
			return 0;
		}
		
		return new BigDecimal((number - min)).divide(new BigDecimal((max - min))).floatValue();
	}
	
	public static double normalize(long number, long min, long max) {
		if (number > max) {
			Console.print(Console.WarningType.Error, "the specified number is more than the specified max!", new Exception());
			return max;
		} else if (number < min) {
			Console.print(Console.WarningType.Error, "the specified number cannot be less than the specified min!", new Exception());
			return 0;
		}
		
		return new BigDecimal((number - min)).divide(new BigDecimal((max - min))).doubleValue();
	}
	
	public static double percentage(double number, double max) {
		return (number / max) * 100d;
	}
	
	public static float percentage(float number, float max) {
		return (number / max) * 100f;
	}
	
	public static float percentage(int number, int max) {
		return ((float) number / (float) max) * 100f;
	}
	
	public static double percentage(long number, long max) {
		return ((double) number / (double) max) * 100d;
	}
	
}
