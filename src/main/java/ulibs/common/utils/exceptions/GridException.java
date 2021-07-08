package main.java.ulibs.common.utils.exceptions;

import main.java.ulibs.common.utils.Grid;

public class GridException extends Exception {
	private static final long serialVersionUID = 9032982831830918733L;
	
	public GridException(Grid<?> grid, Reason reason, int val) {
		super(val + " " + reason.print + " with grid sized '" + grid.getWidth() + "x" + grid.getHeight() + ":" + grid.size() + "'!");
	}
	
	public enum Reason {
		lowX("is lower then width"),
		highX("is higher then width"),
		lowY("is lower then height"),
		highY("is higher then height");
		
		private final String print;
		
		private Reason(String print) {
			this.print = print;
		}
	}
}
