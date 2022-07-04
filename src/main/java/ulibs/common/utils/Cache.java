package main.java.ulibs.common.utils;

public class Cache<K, V> {
	protected K key;
	protected V value;
	private final CachePredicate<K> isPredicate;
	
	private Cache(CachePredicate<K> isPredicate) {
		this.isPredicate = isPredicate;
	}
	
	public static <K, V> Cache<K, V> create() {
		return new Cache<K, V>((k0, k1) -> k0 == k1 || (k0 != null && k0.equals(k1)));
	}
	
	public V set(K key, V value) {
		this.key = key;
		this.value = value;
		return value;
	}
	
	public V setIfDifferent(K key, V value) {
		if (!is(key)) {
			return set(key, value);
		}
		return value;
	}
	
	public boolean isEmpty() {
		return key == null;
	}
	
	public boolean is(K key) {
		return isPredicate.test(this.key, key);
	}
	
	public V get() {
		return value;
	}
	
	@FunctionalInterface
	public interface CachePredicate<K> {
		boolean test(K k0, K k1);
	}
}
