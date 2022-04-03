package main.java.ulibs.common.utils;

public class ArrayWrap {
	private ArrayWrap() {
		
	}
	
	public static class Boolean {
		public boolean[] array;
		
		public Boolean(boolean[] array) {
			this.array = array;
		}
		
		public Boolean(java.lang.Boolean[] array) {
			this.array = new boolean[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
	
	public static class Byte {
		public byte[] array;
		
		public Byte(byte[] array) {
			this.array = array;
		}
		
		public Byte(java.lang.Byte[] array) {
			this.array = new byte[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
	
	public static class Double {
		public double[] array;
		
		public Double(double[] array) {
			this.array = array;
		}
		
		public Double(java.lang.Double[] array) {
			this.array = new double[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
	
	public static class Float {
		public float[] array;
		
		public Float(float[] array) {
			this.array = array;
		}
		
		public Float(java.lang.Float[] array) {
			this.array = new float[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
	
	public static class Integer {
		public int[] array;
		
		public Integer(int[] array) {
			this.array = array;
		}
		
		public Integer(java.lang.Integer[] array) {
			this.array = new int[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
	
	public static class Long {
		public long[] array;
		
		public Long(long[] array) {
			this.array = array;
		}
		
		public Long(java.lang.Long[] array) {
			this.array = new long[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
	
	public static class Short {
		public short[] array;
		
		public Short(short[] array) {
			this.array = array;
		}
		
		public Short(java.lang.Short[] array) {
			this.array = new short[array.length];
			for (int i = 0; i < array.length; i++) {
				this.array[i] = array[i];
			}
		}
	}
}
