package main.java.ulibs.common.helpers;

public class TimeH {
	public static long timeMillisecond(Runnable run) {
		long now = System.currentTimeMillis();
		run.run();
		return System.currentTimeMillis() - now;
	}
	
	public static long timeNanosecond(Runnable run) {
		long now = System.nanoTime();
		run.run();
		return System.nanoTime() - now;
	}
}
