package main.java.ulibs.common.math;

public interface IMath<T extends IMath<T>> {
	public abstract T add(T t);
	public abstract T subtract(T t);
	public abstract T multiply(T t);
	public abstract T divide(T t);
	public abstract boolean isZero();
}
