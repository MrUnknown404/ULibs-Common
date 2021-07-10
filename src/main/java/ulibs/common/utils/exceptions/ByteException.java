package main.java.ulibs.common.utils.exceptions;

public class ByteException extends Exception {
	private static final long serialVersionUID = -5578343974030124118L;
	
	public ByteException(Reason reason) {
		super(reason.print);
	}
	
	public enum Reason {
		wrong_size("Wrong size");
		
		private final String print;
		
		private Reason(String print) {
			this.print = print;
		}
	}
}
