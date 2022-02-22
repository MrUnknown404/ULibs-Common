package main.java.ulibs.common.utils;

import java.util.ArrayList;
import java.util.List;

import main.java.ulibs.common.helpers.CollectionsH;
import main.java.ulibs.common.math.Vec2i;
import main.java.ulibs.common.utils.Console.WarningType;
import main.java.ulibs.common.utils.exceptions.GridException;
import main.java.ulibs.common.utils.exceptions.GridException.Reason;

/** Allows you to store objects in a grid pattern. Functions like a {@link ArrayList} but allows you to set/remove using X/Y coordinates
 * @author -Unknown-
 * @param <T> The type of object to use
 */
public class Grid<T> {
	private final List<T> grid;
	
	/** The grid's width */
	protected final int width;
	/** The grid's height */
	protected final int height;
	
	/** Creates an empty Grid with the given width/height
	 * @param t The object to fill the grid with
	 * @param width The width to use
	 * @param height The height to use
	 */
	public Grid(T t, int width, int height) {
		this.width = width;
		this.height = height;
		this.grid = CollectionsH.fill(width * height, t);
	}
	
	/** Creates an empty Grid with the given width/height
	 * @param width The width to use
	 * @param height The height to use
	 */
	public Grid(int width, int height) {
		this(null, width, height);
	}
	
	/** Creates an empty Grid with the given width/height
	 * @param t The object to fill the grid with
	 * @param vec The size to use
	 */
	public Grid(T t, Vec2i vec) {
		this(t, vec.getX(), vec.getY());
	}
	
	/** Creates an empty Grid with the given width/height
	 * @param vec The size to use
	 */
	public Grid(Vec2i vec) {
		this(null, vec.getX(), vec.getY());
	}
	
	/**
	 * @return a {@link List} of all the objects stored inside the grid
	 */
	public List<T> getAsList() {
		return grid;
	}
	
	/**
	 * @param vec The position to get
	 * @return an Object at the given position
	 */
	public T get(Vec2i vec) {
		return get(vec.getX(), vec.getY());
	}
	
	/** Returns the Object at the given position
	 * @param x The X position to get
	 * @param y The Y position to get
	 * @return an Object at the given position
	 */
	public T get(int x, int y) {
		try {
			return checkValid(x, y) ? grid.get(x + (y * width)) : null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/** Use {@link Grid#set(Object, Vec2i)} */
	@SuppressWarnings("javadoc")
	@Deprecated
	public Grid<T> add(T t, Vec2i vec) {
		return set(t, vec.getX(), vec.getY());
	}
	
	/** Use {@link Grid#set(Object, x, y)} */
	@SuppressWarnings("javadoc")
	@Deprecated
	public Grid<T> add(T t, int x, int y) {
		return set(t, x, y);
	}
	
	/** Sets the given object to the given position
	 * @param t The object to set
	 * @param vec The position to use
	 * @return Returns self
	 */
	public Grid<T> set(T t, Vec2i vec) {
		return set(t, vec.getX(), vec.getY());
	}
	
	/** Sets the given object to the given position
	 * @param t The object to set
	 * @param x The X position to use
	 * @param y The Y position to use
	 * @return Returns self
	 */
	public Grid<T> set(T t, int x, int y) {
		try {
			if (checkValid(x, y)) {
				grid.set(y * width + x, t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	/** Removed an object from the given position
	 * @param vec The position to use
	 * @return Returns self
	 */
	public Grid<T> remove(Vec2i vec) {
		return remove(vec.getX(), vec.getY());
	}
	
	/** Removed an object from the given position
	 * @param x The X position to use
	 * @param y The Y position to use
	 * @return Returns self
	 */
	public Grid<T> remove(int x, int y) {
		try {
			if (checkValid(x, y)) {
				grid.set(y * width + x, null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	/**
	 * @param g The Grid to check
	 * @return True if the given Grid contains the same elements, Otherwise false
	 */
	public boolean is(Grid<T> g) {
		if (g.width != width || g.height != height) {
			return false;
		}
		
		for (int y = 0; y < width; y++) {
			for (int x = 0; x < width; x++) {
				T g0 = get(x, y), g1 = g.get(x, y);
				if (g0 == g1 || (g0 != null && g0.equals(g1))) {
					continue;
				}
				
				return false;
			}
		}
		
		return true;
	}
	
	/** Looks through the grid for any 'Empty' values. If found adds the given object to that position. <br>
	 * By default 'null' is considered 'Empty' for everything. If the type is a {@link String} it'll also check for an empty string after the initial 'Empty' check
	 * @param t The object to add
	 * @return Returns self
	 * @see Grid#whatIsEmpty
	 */
	public Grid<T> addFirstEmpty(T t) {
		if (grid.indexOf(whatIsEmpty()) != -1) {
			grid.set(grid.indexOf(whatIsEmpty()), t);
			return this;
		} else if (t instanceof String && grid.indexOf("") != -1) {
			grid.set(grid.indexOf(""), t);
			return this;
		}
		
		Console.print(WarningType.Debug, "Could not find any null or empty values!");
		return this;
	}
	
	/** @return An object that is considered 'Empty'. <br> Used in {@link Grid#addFirstEmpty} when comparing */
	protected T whatIsEmpty() {
		return null;
	}
	
	private boolean checkValid(int x, int y) throws Exception {
		if (x < 0) {
			Console.print(WarningType.Error, "'X' Cannot be lower than 0! (was " + x + ")", new GridException(this, Reason.lowX, x));
			return false;
		} else if (x >= width) {
			Console.print(WarningType.Error, "'X' Cannot be " + width + " or above! (was " + x + ")", new GridException(this, Reason.highX, x));
			return false;
		} else if (y < 0) {
			Console.print(WarningType.Error, "'Y' Cannot be lower than 0! (was " + y + ")", new GridException(this, Reason.lowY, y));
			return false;
		} else if (y >= height) {
			Console.print(WarningType.Error, "'Y' Cannot be " + height + " or above! (was " + y + ")", new GridException(this, Reason.highY, y));
			return false;
		}
		
		return true;
	}
	
	/** @return Returns the grid's size */
	public int size() {
		return grid.size();
	}
	
	/** @return Returns a boolean depending on whether or not the grid is empty! */
	public boolean isEmpty() {
		return grid.size() == 0;
	}
	
	/** @return Returns the grid's width */
	public int getWidth() {
		return width;
	}
	
	/** @return Returns the grid's height */
	public int getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return grid.toString();
	}
}
