package main.java.ulibs.common.utils;

import java.util.Objects;

@FunctionalInterface
public interface TriPredicate<T0, T1, T2> {
	public abstract boolean test(T0 t0, T1 t1, T2 t2);
	
	default TriPredicate<T0, T1, T2> and(TriPredicate<? super T0, ? super T1, ? super T2> other) {
		Objects.requireNonNull(other);
		return (t0, t1, t2) -> test(t0, t1, t2) && other.test(t0, t1, t2);
	}
	
	default TriPredicate<T0, T1, T2> negate() {
		return (t0, t1, t2) -> !test(t0, t1, t2);
	}
	
	default TriPredicate<T0, T1, T2> or(TriPredicate<? super T0, ? super T1, ? super T2> other) {
		Objects.requireNonNull(other);
		return (t0, t1, t2) -> test(t0, t1, t2) || other.test(t0, t1, t2);
	}
}
