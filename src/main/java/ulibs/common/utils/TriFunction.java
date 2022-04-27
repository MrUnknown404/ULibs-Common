package main.java.ulibs.common.utils;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface TriFunction<T0, T1, T2, R> {
	public abstract R apply(T0 t0, T1 t1, T2 t2);
	
	public default <V> TriFunction<T0, T1, T2, V> andThen(Function<? super R, ? extends V> after) {
		Objects.requireNonNull(after);
		return (T0 t0, T1 t1, T2 t2) -> after.apply(apply(t0, t1, t2));
	}
}
