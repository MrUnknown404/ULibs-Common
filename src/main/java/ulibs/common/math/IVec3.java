package main.java.ulibs.common.math;

/** Parent for all Vec3's
 * @author -Unknown-
 */
public interface IVec3 extends IVec2 {
	/** @return The Z value as an {@link Integer} */
	public abstract int zInt();
	
	/** @return The Z value as an {@link Float} */
	public abstract float zFloat();
	
	/** @return The Z value as an {@link Double} */
	public abstract double zDouble();
}
