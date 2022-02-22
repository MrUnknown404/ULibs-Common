package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec2f implements ICopyable<Vec2f>, IVec<Vec2f, IVec2>, IVec2 {
	protected float x, y;
	
	public Vec2f() {
		x = 0;
		y = 0;
	}
	
	public Vec2f(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2f(float xy) {
		this.x = xy;
		this.y = xy;
	}
	
	public Vec2f(IVec2 vec) {
		this(vec.xFloat(), vec.yFloat());
	}
	
	@Override
	public Vec2f add(IVec2 vec) {
		this.x += vec.xFloat();
		this.y += vec.yFloat();
		return this;
	}
	
	public Vec2f add(float x, float y) {
		this.x += x;
		this.y += y;
		return this;
	}
	
	public Vec2f addX(float x) {
		this.x += x;
		return this;
	}
	
	public Vec2f addY(float y) {
		this.y += y;
		return this;
	}
	
	@Override
	public Vec2f subtract(IVec2 vec) {
		this.x -= vec.xFloat();
		this.y -= vec.yFloat();
		return this;
	}
	
	public Vec2f subtract(float x, float y) {
		this.x -= x;
		this.y -= y;
		return this;
	}
	
	public Vec2f subtractX(float x) {
		this.x -= x;
		return this;
	}
	
	public Vec2f subtractY(float y) {
		this.y -= y;
		return this;
	}
	
	@Override
	public Vec2f multiply(IVec2 vec) {
		this.x *= vec.xFloat();
		this.y *= vec.yFloat();
		return this;
	}
	
	public Vec2f multiply(float x, float y) {
		this.x *= x;
		this.y *= y;
		return this;
	}
	
	public Vec2f multiplyX(float x) {
		this.x *= x;
		return this;
	}
	
	public Vec2f multiplyY(float y) {
		this.y *= y;
		return this;
	}
	
	@Override
	public Vec2f divide(IVec2 vec) {
		this.x /= vec.xFloat();
		this.y /= vec.yFloat();
		return this;
	}
	
	public Vec2f divide(float x, float y) {
		this.x /= x;
		this.y /= y;
		return this;
	}
	
	public Vec2f divideX(float x) {
		this.x /= x;
		return this;
	}
	
	public Vec2f divideY(float y) {
		this.y /= y;
		return this;
	}
	
	@Override
	public Vec2f set(IVec2 vec) {
		this.x = vec.xFloat();
		this.y = vec.yFloat();
		return this;
	}
	
	public Vec2f set(float x, float y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	public Vec2f setX(float x) {
		this.x = x;
		return this;
	}
	
	public Vec2f setY(float y) {
		this.y = y;
		return this;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	@Override
	public Vec2f invert() {
		return new Vec2f(-x, -y);
	}
	
	public float difference(IVec2 vec) {
		return Math.abs(x - vec.xFloat()) + Math.abs(y - vec.yFloat());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0;
	}
	
	@Override
	public Vec2f copy() {
		return new Vec2f(this);
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
	public boolean equals(Object obj) {
		if (obj instanceof Vec2f) {
			if (((Vec2f) obj).x == x && ((Vec2f) obj).y == y) {
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
