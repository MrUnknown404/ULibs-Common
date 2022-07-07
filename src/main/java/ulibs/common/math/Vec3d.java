package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec3d implements ICopyable<Vec3d>, IVec<Vec3d, IVec3>, IVec3 {
	protected double x, y, z;
	
	public Vec3d() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vec3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3d(double xyz) {
		this.x = xyz;
		this.y = xyz;
		this.z = xyz;
	}
	
	public Vec3d(IVec3 vec) {
		this(vec.xDouble(), vec.yDouble(), vec.zDouble());
	}
	
	@Override
	public Vec3d add(IVec3 vec) {
		this.x += vec.xDouble();
		this.y += vec.yDouble();
		this.z += vec.zDouble();
		return this;
	}
	
	public Vec3d add(double x, double y, double z) {
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}
	
	public Vec3d addX(double x) {
		this.x += x;
		return this;
	}
	
	public Vec3d addY(double y) {
		this.y += y;
		return this;
	}
	
	public Vec3d addZ(double z) {
		this.z += z;
		return this;
	}
	
	@Override
	public Vec3d subtract(IVec3 vec) {
		this.x -= vec.xDouble();
		this.y -= vec.yDouble();
		this.z -= vec.zDouble();
		return this;
	}
	
	public Vec3d subtract(double x, double y, double z) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		return this;
	}
	
	public Vec3d subtractX(double x) {
		this.x -= x;
		return this;
	}
	
	public Vec3d subtractY(double y) {
		this.y -= y;
		return this;
	}
	
	public Vec3d subtractZ(double z) {
		this.z -= z;
		return this;
	}
	
	@Override
	public Vec3d multiply(IVec3 vec) {
		this.x *= vec.xDouble();
		this.y *= vec.yDouble();
		this.z *= vec.zDouble();
		return this;
	}
	
	public Vec3d multiply(double x, double y, double z) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
		return this;
	}
	
	public Vec3d multiplyX(double x) {
		this.x *= x;
		return this;
	}
	
	public Vec3d multiplyY(double y) {
		this.y *= y;
		return this;
	}
	
	public Vec3d multiplyZ(double z) {
		this.z *= z;
		return this;
	}
	
	@Override
	public Vec3d divide(IVec3 vec) {
		this.x /= vec.xDouble();
		this.y /= vec.yDouble();
		this.z /= vec.zDouble();
		return this;
	}
	
	public Vec3d divide(double x, double y, double z) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
		return this;
	}
	
	public Vec3d divideX(double x) {
		this.x /= x;
		return this;
	}
	
	public Vec3d divideY(double y) {
		this.y /= y;
		return this;
	}
	
	public Vec3d divideZ(double z) {
		this.z /= z;
		return this;
	}
	
	@Override
	public Vec3d set(IVec3 vec) {
		this.x = vec.xDouble();
		this.y = vec.yDouble();
		this.z = vec.zDouble();
		return this;
	}
	
	public Vec3d set(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}
	
	public Vec3d setX(double x) {
		this.x = x;
		return this;
	}
	
	public Vec3d setY(double y) {
		this.y = y;
		return this;
	}
	
	public Vec3d setZ(double z) {
		this.z = z;
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
	
	@Override
	public Vec3d invert() {
		return new Vec3d(-x, -y, -z);
	}
	
	public double difference(IVec3 vec) {
		return Math.abs(x - vec.xDouble()) + Math.abs(y - vec.yDouble()) + Math.abs(z - vec.zDouble());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0 && z == 0;
	}
	
	@Override
	public Vec3d copy() {
		return new Vec3d(this);
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
	public boolean equals(Object obj) {
		if (obj instanceof Vec3f obj0) {
			if (obj0.x == x && ((Vec3f) obj).y == y && obj0.z == z) {
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
