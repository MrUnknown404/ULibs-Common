package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec3i implements ICopyable<Vec3i>, IVec<Vec3i, IVec3>, IVec3 {
	protected int x, y, z;
	
	public Vec3i() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vec3i(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3i(int xyz) {
		this.x = xyz;
		this.y = xyz;
		this.z = xyz;
	}
	
	public Vec3i(IVec3 vec) {
		this(vec.xInt(), vec.yInt(), vec.zInt());
	}
	
	@Override
	public Vec3i add(IVec3 vec) {
		this.x += vec.xInt();
		this.y += vec.yInt();
		this.z += vec.zInt();
		return this;
	}
	
	public Vec3i add(int x, int y, int z) {
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}
	
	public Vec3i addX(int x) {
		this.x += x;
		return this;
	}
	
	public Vec3i addY(int y) {
		this.y += y;
		return this;
	}
	
	public Vec3i addZ(int z) {
		this.z += z;
		return this;
	}
	
	@Override
	public Vec3i subtract(IVec3 vec) {
		this.x -= vec.xInt();
		this.y -= vec.yInt();
		this.z -= vec.zInt();
		return this;
	}
	
	public Vec3i subtract(int x, int y, int z) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		return this;
	}
	
	public Vec3i subtractX(int x) {
		this.x -= x;
		return this;
	}
	
	public Vec3i subtractY(int y) {
		this.y -= y;
		return this;
	}
	
	public Vec3i subtractZ(int z) {
		this.z -= z;
		return this;
	}
	
	@Override
	public Vec3i multiply(IVec3 vec) {
		this.x *= vec.xInt();
		this.y *= vec.yInt();
		this.z *= vec.zInt();
		return this;
	}
	
	public Vec3i multiply(int x, int y, int z) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
		return this;
	}
	
	public Vec3i multiplyX(int x) {
		this.x *= x;
		return this;
	}
	
	public Vec3i multiplyY(int y) {
		this.y *= y;
		return this;
	}
	
	public Vec3i multiplyZ(int z) {
		this.z *= z;
		return this;
	}
	
	@Override
	public Vec3i divide(IVec3 vec) {
		this.x /= vec.xInt();
		this.y /= vec.yInt();
		this.z /= vec.zInt();
		return this;
	}
	
	public Vec3i divide(int x, int y, int z) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
		return this;
	}
	
	public Vec3i divideX(int x) {
		this.x /= x;
		return this;
	}
	
	public Vec3i divideY(int y) {
		this.y /= y;
		return this;
	}
	
	public Vec3i divideZ(int z) {
		this.z /= z;
		return this;
	}
	
	@Override
	public Vec3i set(IVec3 vec) {
		this.x = vec.xInt();
		this.y = vec.yInt();
		this.z = vec.zInt();
		return this;
	}
	
	public Vec3i set(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}
	
	public Vec3i setX(int x) {
		this.x = x;
		return this;
	}
	
	public Vec3i setY(int y) {
		this.y = y;
		return this;
	}
	
	public Vec3i setZ(int z) {
		this.z = z;
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
	
	@Override
	public Vec3i invert() {
		return new Vec3i(-x, -y, -z);
	}
	
	public int difference(IVec3 vec) {
		return Math.abs(x - vec.xInt()) + Math.abs(y - vec.yInt()) + Math.abs(z - vec.zInt());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0 && z == 0;
	}
	
	@Override
	public Vec3i copy() {
		return new Vec3i(this);
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
	public boolean equals(Object obj) {
		if (obj instanceof Vec3i obj0) {
			if (obj0.x == x && obj0.y == y && obj0.z == z) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
