package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec2d implements ICopyable<Vec2d>, IVec<Vec2d, IVec2>, IVec2 {
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
	
	public Vec2d(IVec2 vec) {
		this(vec.xDouble(), vec.yDouble());
	}
	
	@Override
	public Vec2d add(IVec2 vec) {
		this.x += vec.xDouble();
		this.y += vec.yDouble();
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
	public Vec2d subtract(IVec2 vec) {
		this.x -= vec.xDouble();
		this.y -= vec.yDouble();
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
	public Vec2d multiply(IVec2 vec) {
		this.x *= vec.xDouble();
		this.y *= vec.yDouble();
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
	public Vec2d divide(IVec2 vec) {
		this.x /= vec.xDouble();
		this.y /= vec.yDouble();
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
	
	@Override
	public Vec2d set(IVec2 vec) {
		this.x = vec.xDouble();
		this.y = vec.yDouble();
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
	public Vec2d invert() {
		return new Vec2d(-x, -y);
	}
	
	public double difference(IVec2 vec) {
		return Math.abs(x - vec.xDouble()) + Math.abs(y - vec.yDouble());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0;
	}
	
	@Override
	public Vec2d copy() {
		return new Vec2d(this);
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
	public boolean equals(Object obj) {
		if (obj instanceof Vec2d obj1) {
			if (obj1.x == x && obj1.y == y) {
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
