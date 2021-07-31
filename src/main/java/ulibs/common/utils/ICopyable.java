package main.java.ulibs.common.utils;

/**
 * @author -Unknown-
 * @param <T> The type of object to return as a copy. Typically this would be the same type as the class that implements this
 */
public interface ICopyable<T> {
	/** @return Returns a new instance of self */
	public T copy();
}
