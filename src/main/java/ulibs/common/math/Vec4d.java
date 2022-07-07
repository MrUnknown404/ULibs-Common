package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec4d implements ICopyable<Vec4d>, IVec<Vec4d, IVec4>, IVec4 {
	protected double x, y, z, w;
	
	public Vec4d() {
		x = 0;
		y = 0;
		z = 0;
		w = 0;
	}
	
	public Vec4d(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4d(double xyzw) {
		this.x = xyzw;
		this.y = xyzw;
		this.z = xyzw;
		this.w = xyzw;
	}
	
	public Vec4d(IVec4 vec) {
		this(vec.xDouble(), vec.yDouble(), vec.zDouble(), vec.wDouble());
	}
	
	@Override
	public Vec4d add(IVec4 vec) {
		this.x += vec.xDouble();
		this.y += vec.yDouble();
		this.z += vec.zDouble();
		this.w += vec.wDouble();
		return this;
	}
	
	public Vec4d add(double x, double y, double z, double w) {
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
		return this;
	}
	
	public Vec4d addX(double x) {
		this.x += x;
		return this;
	}
	
	public Vec4d addY(double y) {
		this.y += y;
		return this;
	}
	
	public Vec4d addZ(double z) {
		this.z += z;
		return this;
	}
	
	public Vec4d addW(double w) {
		this.w += w;
		return this;
	}
	
	@Override
	public Vec4d subtract(IVec4 vec) {
		this.x -= vec.xDouble();
		this.y -= vec.yDouble();
		this.z -= vec.zDouble();
		this.w -= vec.wDouble();
		return this;
	}
	
	public Vec4d subtract(double x, double y, double z, double w) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		this.w -= w;
		return this;
	}
	
	public Vec4d subtractX(double x) {
		this.x -= x;
		return this;
	}
	
	public Vec4d subtractY(double y) {
		this.y -= y;
		return this;
	}
	
	public Vec4d subtractZ(double z) {
		this.z -= z;
		return this;
	}
	
	public Vec4d subtractW(double w) {
		this.w -= w;
		return this;
	}
	
	@Override
	public Vec4d multiply(IVec4 vec) {
		this.x *= vec.xDouble();
		this.y *= vec.yDouble();
		this.z *= vec.zDouble();
		this.w *= vec.wDouble();
		return this;
	}
	
	public Vec4d multiply(double x, double y, double z, double w) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
		this.w *= w;
		return this;
	}
	
	public Vec4d multiplyX(double x) {
		this.x *= x;
		return this;
	}
	
	public Vec4d multiplyY(double y) {
		this.y *= y;
		return this;
	}
	
	public Vec4d multiplyZ(double z) {
		this.z *= z;
		return this;
	}
	
	public Vec4d multiplyW(double w) {
		this.w *= w;
		return this;
	}
	
	@Override
	public Vec4d divide(IVec4 vec) {
		this.x /= vec.xDouble();
		this.y /= vec.yDouble();
		this.z /= vec.zDouble();
		this.w /= vec.wDouble();
		return this;
	}
	
	public Vec4d divide(double x, double y, double z, double w) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
		this.w /= w;
		return this;
	}
	
	public Vec4d divideX(double x) {
		this.x /= x;
		return this;
	}
	
	public Vec4d divideY(double y) {
		this.y /= y;
		return this;
	}
	
	public Vec4d divideZ(double z) {
		this.z /= z;
		return this;
	}
	
	public Vec4d divideW(double w) {
		this.w /= w;
		return this;
	}
	
	@Override
	public Vec4d set(IVec4 vec) {
		this.x = vec.xDouble();
		this.y = vec.yDouble();
		this.z = vec.zDouble();
		this.w = vec.wDouble();
		return this;
	}
	
	public Vec4d set(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		return this;
	}
	
	public Vec4d setX(double x) {
		this.x = x;
		return this;
	}
	
	public Vec4d setY(double y) {
		this.y = y;
		return this;
	}
	
	public Vec4d setZ(double z) {
		this.z = z;
		return this;
	}
	
	public Vec4d setW(double w) {
		this.w = w;
		return this;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
	
	public double getW() {
		return w;
	}
	
	@Override
	public Vec4d invert() {
		return new Vec4d(-x, -y, -z, -w);
	}
	
	public double difference(IVec4 vec) {
		return Math.abs(x - vec.xDouble()) + Math.abs(y - vec.yDouble()) + Math.abs(z - vec.zDouble()) + Math.abs(w - vec.wDouble());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0 && z == 0 && w == 0;
	}
	
	@Override
	public Vec4d copy() {
		return new Vec4d(this);
	}
	
	@Override
	public int xInt() {
		return Math.round(xFloat());
	}
	
	@Override
	public float xFloat() {
		return (float) x;
	}
	
	@Override
	public double xDouble() {
		return x;
	}
	
	@Override
	public int yInt() {
		return Math.round(yFloat());
	}
	
	@Override
	public float yFloat() {
		return (float) y;
	}
	
	@Override
	public double yDouble() {
		return y;
	}
	
	@Override
	public int zInt() {
		return Math.round(zFloat());
	}
	
	@Override
	public float zFloat() {
		return (float) z;
	}
	
	@Override
	public double zDouble() {
		return z;
	}
	
	@Override
	public int wInt() {
		return Math.round(wFloat());
	}
	
	@Override
	public float wFloat() {
		return (float) w;
	}
	
	@Override
	public double wDouble() {
		return w;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vec4d obj0) {
			if (obj0.x == x && obj0.y == y && obj0.z == z && obj0.w == w) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y, z, w);
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ", " + w + ")";
	}
}
