package main.java.ulibs.common.utils;

import java.util.Objects;

public class Pair<L, R> {
	private L left;
	private R right;
	
	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	public Pair<L, R> setL(L left) {
		this.left = left;
		return this;
	}
	
	public Pair<L, R> setR(R right) {
		this.right = right;
		return this;
	}
	
	public Pair<L, R> setLeft(L left) {
		this.left = left;
		return this;
	}
	
	public Pair<L, R> setRight(R right) {
		this.right = right;
		return this;
	}
	
	public L getL() {
		return left;
	}
	
	public R getR() {
		return right;
	}
	
	public L getLeft() {
		return left;
	}
	
	public R getRight() {
		return right;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Pair)) {
			return false;
		}
		
		Pair<?, ?> other = (Pair<?, ?>) obj;
		if (left == null) {
			if (other.left != null) {
				return false;
			}
		} else if (!left.equals(other.left)) {
			return false;
		}
		
		if (right == null) {
			if (other.right != null) {
				return false;
			}
		} else if (!right.equals(other.right)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "(" + left + ", " + right + ")";
	}
}
