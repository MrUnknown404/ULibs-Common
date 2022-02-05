package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec3f implements ICopyable<Vec3f>, IMath<Vec3f>, IVec3 {
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
	public Vec3f add(Vec3f vec) {
		this.x += vec.x;
		this.y += vec.y;
		this.z += vec.z;
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
	public Vec3f subtract(Vec3f vec) {
		this.x -= vec.x;
		this.y -= vec.y;
		this.z -= vec.z;
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
	public Vec3f multiply(Vec3f vec) {
		this.x *= vec.x;
		this.y *= vec.y;
		this.z *= vec.z;
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
	public Vec3f divide(Vec3f vec) {
		this.x /= vec.x;
		this.y /= vec.y;
		this.z /= vec.z;
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
	public Vec3f set(Vec3f vec) {
		this.x = vec.x;
		this.y = vec.y;
		this.z = vec.z;
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
	public Vec3f inverse() {
		return new Vec3f(-x, -y, -z);
	}
	
	public float difference(Vec3f vec) {
		return Math.abs(x - vec.x) + Math.abs(y - vec.y) + Math.abs(z - vec.z);
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
		if (obj instanceof Vec3f) {
			if (((Vec3f) obj).x == x && ((Vec3f) obj).y == y && ((Vec3f) obj).z == z) {
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
