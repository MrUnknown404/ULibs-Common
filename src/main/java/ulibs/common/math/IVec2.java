package main.java.ulibs.common.math;

/** Parent for all Vec2's
 * @author -Unknown-
 */
public interface IVec2 {
	/** @return The X value as an {@link Integer} */
	public abstract int xInt();
	
	/** @return The X value as an {@link Float} */
	public abstract float xFloat();
	
	/** @return The X value as an {@link Double} */
	public abstract double xDouble();
	
	/** @return The Y value as an {@link Integer} */
	public abstract int yInt();
	
	/** @return The Y value as an {@link Float} */
	public abstract float yFloat();
	
	/** @return The Y value as an {@link Double} */
	public abstract double yDouble();
}
