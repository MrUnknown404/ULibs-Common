package main.java.ulibs.common.utils;

import java.util.Objects;

@FunctionalInterface
public interface TriConsumer<T0, T1, T2> {
	public abstract void accept(T0 t0, T1 t1, T2 t2);
	
	public default TriConsumer<T0, T1, T2> andThen(TriConsumer<? super T0, ? super T1, ? super T2> after) {
		Objects.requireNonNull(after);
		
		return (t0, t1, t2) -> {
			accept(t0, t1, t2);
			after.accept(t0, t1, t2);
		};
	}
}
