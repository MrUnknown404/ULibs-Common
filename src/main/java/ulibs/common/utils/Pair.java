package main.java.ulibs.common.utils;

import java.util.Objects;

public class Pair<L, R> {
	private L left;
	private R right;
	
	public static <L, R> Pair<L, R> of(L l, R r) {
		return new Pair<L, R>(l, r);
	}
	
	private Pair(L left, R right) {
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
		return setL(left);
	}
	
	public Pair<L, R> setRight(R right) {
		return setR(right);
	}
	
	public L getL() {
		return left;
	}
	
	public R getR() {
		return right;
	}
	
	public L getLeft() {
		return getL();
	}
	
	public R getRight() {
		return getR();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this != obj || obj == null) {
			return false;
		} else if (obj instanceof Pair<?, ?> obj0) {
			if (left == null && obj0.left != null) {
				return false;
			} else if (!left.equals(obj0.left)) {
				return false;
			}
			
			if (right == null && obj0.right != null) {
				return false;
			} else if (!right.equals(obj0.right)) {
				return false;
			}
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "(" + left + ", " + right + ")";
	}
}
