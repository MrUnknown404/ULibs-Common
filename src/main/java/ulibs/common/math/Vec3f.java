package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec3f implements ICopyable<Vec3f>, IVec<Vec3f, IVec3>, IVec3 {
	protected float x, y, z;
	
	public Vec3f() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vec3f(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3f(float xyz) {
		this.x = xyz;
		this.y = xyz;
		this.z = xyz;
	}
	
	public Vec3f(IVec3 vec) {
		this(vec.xFloat(), vec.yFloat(), vec.zFloat());
	}
	
	@Override
	public Vec3f add(IVec3 vec) {
		this.x += vec.xFloat();
		this.y += vec.yFloat();
		this.z += vec.zFloat();
		return this;
	}
	
	public Vec3f add(float x, float y, float z) {
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}
	
	public Vec3f addX(float x) {
		this.x += x;
		return this;
	}
	
	public Vec3f addY(float y) {
		this.y += y;
		return this;
	}
	
	public Vec3f addZ(float z) {
		this.z += z;
		return this;
	}
	
	@Override
	public Vec3f subtract(IVec3 vec) {
		this.x -= vec.xFloat();
		this.y -= vec.yFloat();
		this.z -= vec.zFloat();
		return this;
	}
	
	public Vec3f subtract(float x, float y, float z) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		return this;
	}
	
	public Vec3f subtractX(float x) {
		this.x -= x;
		return this;
	}
	
	public Vec3f subtractY(float y) {
		this.y -= y;
		return this;
	}
	
	public Vec3f subtractZ(float z) {
		this.z -= z;
		return this;
	}
	
	@Override
	public Vec3f multiply(IVec3 vec) {
		this.x *= vec.xFloat();
		this.y *= vec.yFloat();
		this.z *= vec.zFloat();
		return this;
	}
	
	public Vec3f multiply(float x, float y, float z) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
		return this;
	}
	
	public Vec3f multiplyX(float x) {
		this.x *= x;
		return this;
	}
	
	public Vec3f multiplyY(float y) {
		this.y *= y;
		return this;
	}
	
	public Vec3f multiplyZ(float z) {
		this.z *= z;
		return this;
	}
	
	@Override
	public Vec3f divide(IVec3 vec) {
		this.x /= vec.xFloat();
		this.y /= vec.yFloat();
		this.z /= vec.zFloat();
		return this;
	}
	
	public Vec3f divide(float x, float y, float z) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
		return this;
	}
	
	public Vec3f divideX(float x) {
		this.x /= x;
		return this;
	}
	
	public Vec3f divideY(float y) {
		this.y /= y;
		return this;
	}
	
	public Vec3f divideZ(float z) {
		this.z /= z;
		return this;
	}
	
	@Override
	public Vec3f set(IVec3 vec) {
		this.x = vec.xFloat();
		this.y = vec.yFloat();
		this.z = vec.zFloat();
		return this;
	}
	
	public Vec3f set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}
	
	public Vec3f setX(float x) {
		this.x = x;
		return this;
	}
	
	public Vec3f setY(float y) {
		this.y = y;
		return this;
	}
	
	public Vec3f setZ(float z) {
		this.z = z;
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
	
	@Override
	public Vec3f invert() {
		return new Vec3f(-x, -y, -z);
	}
	
	public float difference(IVec3 vec) {
		return Math.abs(x - vec.xFloat()) + Math.abs(y - vec.yFloat()) + Math.abs(z - vec.zFloat());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0 && z == 0;
	}
	
	@Override
	public Vec3f copy() {
		return new Vec3f(this);
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
	public boolean equals(Object obj) {
		if (obj instanceof Vec3f obj0) {
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
