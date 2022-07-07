package main.java.ulibs.common.math;

import java.util.Objects;

import main.java.ulibs.common.utils.ICopyable;

@SuppressWarnings("javadoc")
public class Vec2i implements ICopyable<Vec2i>, IVec<Vec2i, IVec2>, IVec2 {
	protected int x, y;
	
	public Vec2i() {
		x = 0;
		y = 0;
	}
	
	public Vec2i(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2i(int xy) {
		this.x = xy;
		this.y = xy;
	}
	
	public Vec2i(IVec2 vec) {
		this(vec.xInt(), vec.yInt());
	}
	
	@Override
	public Vec2i add(IVec2 vec) {
		this.x += vec.xInt();
		this.y += vec.yInt();
		return this;
	}
	
	public Vec2i add(int x, int y) {
		this.x += x;
		this.y += y;
		return this;
	}
	
	public Vec2i addX(int x) {
		this.x += x;
		return this;
	}
	
	public Vec2i addY(int y) {
		this.y += y;
		return this;
	}
	
	@Override
	public Vec2i subtract(IVec2 vec) {
		this.x -= vec.xInt();
		this.y -= vec.yInt();
		return this;
	}
	
	public Vec2i subtract(int x, int y) {
		this.x -= x;
		this.y -= y;
		return this;
	}
	
	public Vec2i subtractX(int x) {
		this.x -= x;
		return this;
	}
	
	public Vec2i subtractY(int y) {
		this.y -= y;
		return this;
	}
	
	@Override
	public Vec2i multiply(IVec2 vec) {
		this.x *= vec.xInt();
		this.y *= vec.yInt();
		return this;
	}
	
	public Vec2i multiply(int x, int y) {
		this.x *= x;
		this.y *= y;
		return this;
	}
	
	public Vec2i multiplyX(int x) {
		this.x *= x;
		return this;
	}
	
	public Vec2i multiplyY(int y) {
		this.y *= y;
		return this;
	}
	
	@Override
	public Vec2i divide(IVec2 vec) {
		this.x /= vec.xInt();
		this.y /= vec.yInt();
		return this;
	}
	
	public Vec2i divide(int x, int y) {
		this.x /= x;
		this.y /= y;
		return this;
	}
	
	public Vec2i divideX(int x) {
		this.x /= x;
		return this;
	}
	
	public Vec2i divideY(int y) {
		this.y /= y;
		return this;
	}
	
	@Override
	public Vec2i set(IVec2 vec) {
		this.x = vec.xInt();
		this.y = vec.yInt();
		return this;
	}
	
	public Vec2i set(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	public Vec2i setX(int x) {
		this.x = x;
		return this;
	}
	
	public Vec2i setY(int y) {
		this.y = y;
		return this;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public Vec2i invert() {
		return new Vec2i(-x, -y);
	}
	
	public int difference(IVec2 vec) {
		return Math.abs(x - vec.xInt()) + Math.abs(y - vec.yInt());
	}
	
	@Override
	public boolean isZero() {
		return x == 0 && y == 0;
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
	public Vec2i copy() {
		return new Vec2i(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vec2i obj0) {
			if (obj0.x == x && obj0.y == y) {
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
