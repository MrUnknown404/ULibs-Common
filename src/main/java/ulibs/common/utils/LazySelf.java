package main.java.ulibs.common.utils;

import java.util.function.Function;

public final class LazySelf<S, R> {
	private Function<S, R> func;
	private R value;
	
	public LazySelf(Function<S, R> func) {
		this.func = func;
	}
	
	public R apply(S obj) {
		return value == null ? (value = func.apply(obj)) : value;
	}
	
	public void set(R value) {
		this.value = value;
	}
}
