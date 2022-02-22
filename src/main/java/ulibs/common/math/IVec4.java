package main.java.ulibs.common.math;

/** Parent for all Vec4's
 * @author -Unknown-
 */
public interface IVec4 extends IVec3 {
	/** @return The W value as an {@link Integer} */
	public abstract int wInt();
	
	/** @return The W value as an {@link Float} */
	public abstract float wFloat();
	
	/** @return The W value as an {@link Double} */
	public abstract double wDouble();
	
}
