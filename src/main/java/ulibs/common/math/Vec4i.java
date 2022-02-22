package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec4i implements ICopyable<Vec4i>, IVec<Vec4i, IVec4>, IVec4 {
	protected int x, y, z, w;
	
	public Vec4i() {
		x = 0;
		y = 0;
		z = 0;
		w = 0;
	}
	
	public Vec4i(int x, int y, int z, int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4i(int xyzw) {
		this.x = xyzw;
		this.y = xyzw;
		this.z = xyzw;
		this.w = xyzw;
	}
	
	public Vec4i(IVec4 vec) {
		this(vec.xInt(), vec.yInt(), vec.zInt(), vec.wInt());
	}
	
	@Override
	public Vec4i add(IVec4 vec) {
		this.x += vec.xInt();
		this.y += vec.yInt();
		this.z += vec.zInt();
		this.w += vec.wInt();
		return this;
	}
	
	public Vec4i add(int x, int y, int z, int w) {
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
		return this;
	}
	
	public Vec4i addX(int x) {
		this.x += x;
		return this;
	}
	
	public Vec4i addY(int y) {
		this.y += y;
		return this;
	}
	
	public Vec4i addZ(int z) {
		this.z += z;
		return this;
	}
	
	public Vec4i addW(int w) {
		this.w += w;
		return this;
	}
	
	@Override
	public Vec4i subtract(IVec4 vec) {
		this.x -= vec.xInt();
		this.y -= vec.yInt();
		this.z -= vec.zInt();
		this.w -= vec.wInt();
		return this;
	}
	
	public Vec4i subtract(int x, int y, int z, int w) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		this.w -= w;
		return this;
	}
	
	public Vec4i subtractX(int x) {
		this.x -= x;
		return this;
	}
	
	public Vec4i subtractY(int y) {
		this.y -= y;
		return this;
	}
	
	public Vec4i subtractZ(int z) {
		this.z -= z;
		return this;
	}
	
	public Vec4i subtractW(int w) {
		this.w -= w;
		return this;
	}
	
	@Override
	public Vec4i multiply(IVec4 vec) {
		this.x *= vec.xInt();
		this.y *= vec.yInt();
		this.z *= vec.zInt();
		this.w *= vec.wInt();
		return this;
	}
	
	public Vec4i multiply(int x, int y, int z, int w) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
		this.w *= w;
		return this;
	}
	
	public Vec4i multiplyX(int x) {
		this.x *= x;
		return this;
	}
	
	public Vec4i multiplyY(int y) {
		this.y *= y;
		return this;
	}
	
	public Vec4i multiplyZ(int z) {
		this.z *= z;
		return this;
	}
	
	public Vec4i multiplyW(int w) {
		this.w *= w;
		return this;
	}
	
	@Override
	public Vec4i divide(IVec4 vec) {
		this.x /= vec.xInt();
		this.y /= vec.yInt();
		this.z /= vec.zInt();
		this.w /= vec.wInt();
		return this;
	}
	
	public Vec4i divide(int x, int y, int z, int w) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
		this.w /= w;
		return this;
	}
	
	public Vec4i divideX(int x) {
		this.x /= x;
		return this;
	}
	
	public Vec4i divideY(int y) {
		this.y /= y;
		return this;
	}
	
	public Vec4i divideZ(int z) {
		this.z /= z;
		return this;
	}
	
	public Vec4i divideW(int w) {
		this.w /= w;
		return this;
	}
	
	@Override
	public Vec4i set(IVec4 vec) {
		this.x = vec.xInt();
		this.y = vec.yInt();
		this.z = vec.zInt();
		this.w = vec.wInt();
		return this;
	}
	
	public Vec4i set(int x, int y, int z, int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		return this;
	}
	
	public Vec4i setX(int x) {
		this.x = x;
		return this;
	}
	
	public Vec4i setY(int y) {
		this.y = y;
		return this;
	}
	
	public Vec4i setZ(int z) {
		this.z = z;
		return this;
	}
	
	public Vec4i setW(int w) {
		this.w = w;
		return this;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public int getW() {
		return w;
	}
	
	@Override
	public Vec4i invert() {
		return new Vec4i(-x, -y, -z, -w);
	}
	
	public int difference(IVec4 vec) {
		return Math.abs(x - vec.xInt()) + Math.abs(y - vec.yInt()) + Math.abs(z - vec.zInt()) + Math.abs(w - vec.wInt());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0 && z == 0 && w == 0;
	}
	
	@Override
	public Vec4i copy() {
		return new Vec4i(this);
	}
	
	@Override
	public int xInt() {
		return x;
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
		return y;
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
		return z;
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
		return w;
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
		if (obj instanceof Vec4i) {
			if (((Vec4i) obj).x == x && ((Vec4i) obj).y == y && ((Vec4i) obj).z == z && ((Vec4i) obj).w == w) {
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
