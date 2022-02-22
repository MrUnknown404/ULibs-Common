package main.java.ulibs.common.math;

interface IVec<S extends IVec<S, T> & IVec2, T extends IVec2> {
	/**
	 * @param t The IVec to add
	 * @return The same IVec with the given IVec values added
	 */
	public abstract S add(T t);
	
	/**
	 * @param t The IVec to subtract
	 * @return The same IVec with the given IVec values subtracted
	 */
	public abstract S subtract(T t);
	
	/**
	 * @param t The IVec to multiply
	 * @return The same IVec with the given IVec values multiplied
	 */
	public abstract S multiply(T t);
	
	/**
	 * @param t The IVec to divide
	 * @return The same IVec with the given IVec values divided
	 */
	public abstract S divide(T t);
	
	/**
	 * @param t The IVec to set
	 * @return The same IVec with the values set to the given IVec
	 */
	public abstract S set(T t);
	
	/** @return A new IVec with all the values inverted */
	public abstract S invert();
	
	/** @return True if all the values are 0. Otherwise false */
	public abstract boolean isZero();
}
