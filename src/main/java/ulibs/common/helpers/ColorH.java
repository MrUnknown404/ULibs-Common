package main.java.ulibs.common.helpers;

import java.awt.Color;

import main.java.ulibs.common.math.Vec4f;

public class ColorH {
	public static Vec4f colorToVec4(Color color) {
		return new Vec4f(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, color.getAlpha() / 255f);
	}
}
