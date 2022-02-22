package main.java.ulibs.common.helpers;

import java.awt.Color;

import main.java.ulibs.common.math.Vec4f;

/** A bunch of utility methods involving {@link Color}
 * @author -Unknown-
 */
public class ColorH {
	/** Creates a {@link Vec4f} based off the given {@link Color}
	 * @param color The color to convert
	 * @return A a normalized Vec4f based off of the given color
	 */
	public static Vec4f colorToVec4(Color color) {
		return new Vec4f(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, color.getAlpha() / 255f);
	}
	
	/** Creates a new Color based off the given Vec4f. The Vec4f should be normalized!
	 * @param vec A normalized Vec4f
	 * @return A new Color based off the given Vec4f
	 */
	public static Color normalizedVec4ToColor(Vec4f vec) {
		return new Color(vec.getX() * 255f, vec.getY() * 255f, vec.getZ() * 255f, vec.getW() * 255f);
	}
	
	/** Creates a new Color based off the given Vec4f
	 * @param vec A Vec4f
	 * @return A new Color based off the given Vec4f
	 */
	public static Color vec4ToColor(Vec4f vec) {
		return new Color(vec.getX(), vec.getY(), vec.getZ(), vec.getW());
	}
}
