package main.java.ulibs.common.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** A way of writing to the debug console with extra information and printing to a log file
 * <br>
 * {@link #setupLogFile} should be run before you print anything if you want to have log files
 * 
 * @author -Unknown-
 */
public final class Console {
	private static PrintWriter prt;
	
	/** Whether or not to show the thread in the debug information */
	public static boolean showThread;
	
	/** Anything in this area will not be printed to log or console! */
	public static WarningType[] disabledTypes = { WarningType.RegisterDebug, WarningType.TextureDebug, WarningType.Debug };
	
	/** Sets up a {@link PrintWriter} to save the console output to file.
	 * Also automatically deletes any logs after
	 * @param logFolder The folder to write logs to
	 * @param maxAmountOfLogs The amount of logs to keep. If 0 will disable writing log to file
	 */
	public static void setupLogFile(File logFolder, int maxAmountOfLogs) {
		if (maxAmountOfLogs == 0) {
			return;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-SSS");
		String curDate = sdf.format(new Date());
		
		final int logSize = 31;
		
		if (!logFolder.exists()) {
			logFolder.mkdirs();
		} else {
			int curAmount = 0;
			for (File f : logFolder.listFiles()) {
				if (f.getName().endsWith(".log") && f.getName().length() == logSize) {
					try {
						sdf.parse(f.getName().substring(4, f.getName().length() - 4));
						curAmount++;
					} catch (ParseException e) {
						continue;
					}
				}
			}
			
			if (curAmount >= maxAmountOfLogs) {
				while (curAmount >= maxAmountOfLogs) {
					File oldest = null;
					for (File f : logFolder.listFiles()) {
						if (f.getName().endsWith(".log") && f.getName().length() == logSize) {
							try {
								Date d = sdf.parse(f.getName().substring(4, f.getName().length() - 4));
								
								if (oldest != null) {
									if (d.before(sdf.parse(oldest.getName().substring(4, oldest.getName().length() - 4)))) {
										oldest = f;
									}
								} else {
									oldest = f;
								}
							} catch (ParseException e) {
								continue;
							}
						} else {
							continue;
						}
					}
					
					oldest.delete();
					
					curAmount = 0;
					for (File f : logFolder.listFiles()) {
						if (f.getName().endsWith(".log") && f.getName().length() == logSize) {
							try {
								sdf.parse(f.getName().substring(4, f.getName().length() - 4));
								curAmount++;
							} catch (ParseException e) {
								continue;
							}
						}
					}
				}
			}
		}
		
		File log = new File(logFolder + "\\Log-" + curDate + ".log");
		
		try {
			FileOutputStream os = new FileOutputStream(log);
			System.setOut(new ConsolePrintStream(os, System.out));
			System.setErr(new ConsolePrintStream(os, System.err));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			prt = new PrintWriter(log);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/** Prints date info to the console Example: <p> [12:34:56:789] [Info] [ExampleClass.exampleMethod.69] [Hour/Minute/Second/Millisecond] */
	public static void getTimeExample() {
		String msg = "[" + new SimpleDateFormat("hh:mm:ss:SSS").format(new Date()) + "]" + (showThread ? " [T/" + Thread.currentThread().getName() + "] " : " ") + "[" +
				WarningType.Info + "] [" + getCallerInfo(Console.class) + "] [Hour/Minute/Second/Millisecond]";
		
		System.out.println(msg);
	}
	
	/** Prints date info plus the given string to the console Example: <p> [12:34:56:789] [Debug] [ExampleClass.exampleMethod.69] : Hello! 
	 * @param type The type of warning to display. Defaults to {@link WarningType#Debug} if null
	 * @param string The string to print
	 * @param e {@link Exception} to throw
	 */
	public static void print(WarningType type, String string, Exception e) {
		if (type == null) {
			System.out.println(getHeader(WarningType.Debug) + string);
			return;
		}
		
		for (WarningType t : disabledTypes) {
			if (t == type) {
				return;
			}
		}
		
		if (type == WarningType.Error || type == WarningType.FatalError) {
			System.err.println(getHeader(type) + string);
		} else {
			System.out.println(getHeader(type) + string);
		}
		
		if (e != null) {
			try {
				throw e;
			} catch (Exception e0) {
				e0.printStackTrace();
			}
		}
	}
	
	/** Prints date info plus the given string to the console Example: <p> [12:34:56:789] [Debug] [ExampleClass.exampleMethod.69] : Hello!
	 * @param type The type of warning to display. Defaults to {@link WarningType#Debug}
	 * @param string The string to print
	 */
	public static void print(WarningType type, String string) {
		print(type, string, null);
	}
	
	/** Prints date info plus the given string to the console Example: <p> [12:34:56:789] [Debug] [ExampleClass.exampleMethod.69] : Hello! <br>
	 * Defaults to {@link WarningType#Debug}
	 * @param string The string to print
	 */
	public static void print(String string) {
		print(null, string);
	}
	
	private static String getHeader(WarningType type) {
		return "[" + new SimpleDateFormat("hh:mm:ss:SSS").format(new Date()) + "]" + (showThread ? " [T/" + Thread.currentThread().getName() + "] " : " ") + "[" + type.toString() +
				"] [" + getCallerInfo(Console.class) + "] : ";
	}
	
	private static String getCallerInfo(Class<?> clazz) {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		for (int i = 1; i < stElements.length; i++) {
			StackTraceElement ste = stElements[i];
			if (!ste.getClassName().equals(clazz.getName()) && ste.getClassName().indexOf("java.lang.Thread") != 0) {
				String className = ste.getClassName().replaceAll(ste.getClassName().substring(0, ste.getClassName().lastIndexOf('.') + 1), "");
				if (className.contains("$")) {
					className = className.substring(0, className.indexOf("$"));
				}
				
				return (className + "." + ste.getMethodName() + "." + ste.getLineNumber()).replace("$", ".").replace("<", "").replace(">", "");
			}
		}
		
		return null;
	}
	
	@SuppressWarnings("javadoc")
	public enum WarningType {
		Debug,
		Info,
		Warning,
		Error,
		FatalError,
		
		TextureDebug,
		RegisterDebug;
	}
	
	private static class ConsolePrintStream extends PrintStream {
		private final PrintStream def;
		
		private ConsolePrintStream(OutputStream out, PrintStream def) {
			super(out, true);
			this.def = def;
		}
		
		@Override
		public void write(byte[] buf, int off, int len) {
			char[] cbuf = new char[buf.length];
			for (int i = 0; i < buf.length; i++) {
				cbuf[i] = (char) buf[i];
			}
			
			Console.prt.write(cbuf, off, len);
			Console.prt.flush();
			def.write(buf, off, len);
		}
	}
}
