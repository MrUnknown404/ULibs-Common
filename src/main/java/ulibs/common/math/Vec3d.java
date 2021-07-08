package main.java.ulibs.common.math;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec3d implements ICopyable<Vec3d>, IMath<Vec3d> {
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
	
	public Vec3d(Vec3i vec) {
		this(vec.getX(), vec.getY(), vec.getZ());
	}
	
	public Vec3d(Vec3f vec) {
		this(vec.getX(), vec.getY(), vec.getZ());
	}
	
	public Vec3d(Vec3d vec) {
		this(vec.getX(), vec.getY(), vec.getZ());
	}
	
	@Override
	public Vec3d add(Vec3d vec) {
		this.x += vec.x;
		this.y += vec.y;
		this.z += vec.z;
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
	public Vec3d subtract(Vec3d vec) {
		this.x -= vec.x;
		this.y -= vec.y;
		this.z -= vec.z;
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
	public Vec3d multiply(Vec3d vec) {
		this.x *= vec.x;
		this.y *= vec.y;
		this.z *= vec.z;
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
	public Vec3d divide(Vec3d vec) {
		this.x /= vec.x;
		this.y /= vec.y;
		this.z /= vec.z;
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
	
	public Vec3d set(Vec3d vec) {
		this.x = vec.x;
		this.y = vec.y;
		this.z = vec.z;
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
	
	public Vec3d inverse() {
		return new Vec3d(-x, -y, -z);
	}
	
	public double difference(Vec3d vec) {
		return Math.abs(x - vec.x) + Math.abs(y - vec.y) + Math.abs(z - vec.z);
	}
	
	@Override
	public boolean isZero() {
		return (x == 0 && y == 0 && z == 0) ? true : false;
	}
	
	@Override
	public Vec3d copy() {
		return new Vec3d(this);
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
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
