package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec4f implements ICopyable<Vec4f>, IVec<Vec4f, IVec4>, IVec4 {
	protected float x, y, z, w;
	
	public Vec4f() {
		x = 0;
		y = 0;
		z = 0;
		w = 0;
	}
	
	public Vec4f(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4f(float xyzw) {
		this.x = xyzw;
		this.y = xyzw;
		this.z = xyzw;
		this.w = xyzw;
	}
	
	public Vec4f(IVec4 vec) {
		this(vec.xFloat(), vec.yFloat(), vec.zFloat(), vec.wFloat());
	}
	
	@Override
	public Vec4f add(IVec4 vec) {
		this.x += vec.xFloat();
		this.y += vec.yFloat();
		this.z += vec.zFloat();
		this.w += vec.wFloat();
		return this;
	}
	
	public Vec4f add(float x, float y, float z, float w) {
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
		return this;
	}
	
	public Vec4f addX(float x) {
		this.x += x;
		return this;
	}
	
	public Vec4f addY(float y) {
		this.y += y;
		return this;
	}
	
	public Vec4f addZ(float z) {
		this.z += z;
		return this;
	}
	
	public Vec4f addW(float w) {
		this.w += w;
		return this;
	}
	
	@Override
	public Vec4f subtract(IVec4 vec) {
		this.x -= vec.xFloat();
		this.y -= vec.yFloat();
		this.z -= vec.zFloat();
		this.w -= vec.wFloat();
		return this;
	}
	
	public Vec4f subtract(float x, float y, float z, float w) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		this.w -= w;
		return this;
	}
	
	public Vec4f subtractX(float x) {
		this.x -= x;
		return this;
	}
	
	public Vec4f subtractY(float y) {
		this.y -= y;
		return this;
	}
	
	public Vec4f subtractZ(float z) {
		this.z -= z;
		return this;
	}
	
	public Vec4f subtractW(float w) {
		this.w -= w;
		return this;
	}
	
	@Override
	public Vec4f multiply(IVec4 vec) {
		this.x *= vec.xFloat();
		this.y *= vec.yFloat();
		this.z *= vec.zFloat();
		this.w *= vec.wFloat();
		return this;
	}
	
	public Vec4f multiply(float x, float y, float z, float w) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
		this.w *= w;
		return this;
	}
	
	public Vec4f multiplyX(float x) {
		this.x *= x;
		return this;
	}
	
	public Vec4f multiplyY(float y) {
		this.y *= y;
		return this;
	}
	
	public Vec4f multiplyZ(float z) {
		this.z *= z;
		return this;
	}
	
	public Vec4f multiplyW(float w) {
		this.w *= w;
		return this;
	}
	
	@Override
	public Vec4f divide(IVec4 vec) {
		this.x /= vec.xFloat();
		this.y /= vec.yFloat();
		this.z /= vec.zFloat();
		this.w /= vec.wFloat();
		return this;
	}
	
	public Vec4f divide(float x, float y, float z, float w) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
		this.w /= w;
		return this;
	}
	
	public Vec4f divideX(float x) {
		this.x /= x;
		return this;
	}
	
	public Vec4f divideY(float y) {
		this.y /= y;
		return this;
	}
	
	public Vec4f divideZ(float z) {
		this.z /= z;
		return this;
	}
	
	public Vec4f divideW(float w) {
		this.w /= w;
		return this;
	}
	
	@Override
	public Vec4f set(IVec4 vec) {
		this.x = vec.xFloat();
		this.y = vec.yFloat();
		this.z = vec.zFloat();
		this.w = vec.wFloat();
		return this;
	}
	
	public Vec4f set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		return this;
	}
	
	public Vec4f setX(float x) {
		this.x = x;
		return this;
	}
	
	public Vec4f setY(float y) {
		this.y = y;
		return this;
	}
	
	public Vec4f setZ(float z) {
		this.z = z;
		return this;
	}
	
	public Vec4f setW(float w) {
		this.w = w;
		return this;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	public float getW() {
		return w;
	}
	
	@Override
	public Vec4f invert() {
		return new Vec4f(-x, -y, -z, -w);
	}
	
	public float difference(IVec4 vec) {
		return Math.abs(x - vec.xFloat()) + Math.abs(y - vec.yFloat()) + Math.abs(z - vec.zFloat()) + Math.abs(w - vec.wFloat());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0 && z == 0 && w == 0;
	}
	
	@Override
	public Vec4f copy() {
		return new Vec4f(this);
	}
	
	@Override
	public int xInt() {
		return Math.round(x);
	}
	
	@Override
	public float xFloat() {
		return x;
	}
	
	@Override
	public double xDouble() {
		return x;
	}
	
	@Override
	public int yInt() {
		return Math.round(y);
	}
	
	@Override
	public float yFloat() {
		return y;
	}
	
	@Override
	public double yDouble() {
		return y;
	}
	
	@Override
	public int zInt() {
		return Math.round(z);
	}
	
	@Override
	public float zFloat() {
		return z;
	}
	
	@Override
	public double zDouble() {
		return z;
	}
	
	@Override
	public int wInt() {
		return Math.round(w);
	}
	
	@Override
	public float wFloat() {
		return w;
	}
	
	@Override
	public double wDouble() {
		return w;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vec4f) {
			if (((Vec4f) obj).x == x && ((Vec4f) obj).y == y && ((Vec4f) obj).z == z && ((Vec4f) obj).w == w) {
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
