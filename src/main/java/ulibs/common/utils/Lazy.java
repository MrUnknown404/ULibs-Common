package main.java.ulibs.common.utils;

import java.util.function.Supplier;

public final class Lazy<R> {
	private Supplier<R> sup;
	private R value;
	
	public Lazy(Supplier<R> sup) {
		this.sup = sup;
	}
	
	public R get() {
		return value == null ? (value = sup.get()) : value;
	}
}
