package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec2d implements ICopyable<Vec2d>, IMath<Vec2d> {
	protected double x, y;
	
	public Vec2d() {
		x = 0;
		y = 0;
	}
	
	public Vec2d(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2d(double xy) {
		this.x = xy;
		this.y = xy;
	}
	
	public Vec2d(Vec2i vec) {
		this(vec.getX(), vec.getY());
	}
	
	public Vec2d(Vec2f vec) {
		this(vec.getX(), vec.getY());
	}
	
	public Vec2d(Vec2d vec) {
		this(vec.getX(), vec.getY());
	}
	
	@Override
	public Vec2d add(Vec2d vec) {
		this.x += vec.x;
		this.y += vec.y;
		return this;
	}
	
	public Vec2d add(double x, double y) {
		this.x += x;
		this.y += y;
		return this;
	}
	
	public Vec2d addX(double x) {
		this.x += x;
		return this;
	}
	
	public Vec2d addY(double y) {
		this.y += y;
		return this;
	}
	
	@Override
	public Vec2d subtract(Vec2d vec) {
		this.x -= vec.x;
		this.y -= vec.y;
		return this;
	}
	
	public Vec2d subtract(double x, double y) {
		this.x -= x;
		this.y -= y;
		return this;
	}
	
	public Vec2d subtractX(double x) {
		this.x -= x;
		return this;
	}
	
	public Vec2d subtractY(double y) {
		this.y -= y;
		return this;
	}
	
	@Override
	public Vec2d multiply(Vec2d vec) {
		this.x *= vec.x;
		this.y *= vec.y;
		return this;
	}
	
	public Vec2d multiply(double x, double y) {
		this.x *= x;
		this.y *= y;
		return this;
	}
	
	public Vec2d multiplyX(double x) {
		this.x *= x;
		return this;
	}
	
	public Vec2d multiplyY(double y) {
		this.y *= y;
		return this;
	}
	
	@Override
	public Vec2d divide(Vec2d vec) {
		this.x /= vec.x;
		this.y /= vec.y;
		return this;
	}
	
	public Vec2d divide(double x, double y) {
		this.x /= x;
		this.y /= y;
		return this;
	}
	
	public Vec2d divideX(double x) {
		this.x /= x;
		return this;
	}
	
	public Vec2d divideY(double y) {
		this.y /= y;
		return this;
	}
	
	public Vec2d set(Vec2d vec) {
		this.x = vec.x;
		this.y = vec.y;
		return this;
	}
	
	public Vec2d set(double x, double y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	public Vec2d setX(double x) {
		this.x = x;
		return this;
	}
	
	public Vec2d setY(double y) {
		this.y = y;
		return this;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	@Override
	public Vec2d inverse() {
		return new Vec2d(-x, -y);
	}
	
	public double difference(Vec2d vec) {
		return Math.abs(x - vec.x) + Math.abs(y - vec.y);
	}
	
	@Override
	public boolean isZero() {
		return (x == 0 && y == 0) ? true : false;
	}
	
	@Override
	public Vec2d copy() {
		return new Vec2d(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vec2d) {
			if (((Vec2d) obj).x == x && ((Vec2d) obj).y == y) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
