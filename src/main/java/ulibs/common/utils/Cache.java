package main.java.ulibs.common.utils;

public class Cache<K, V> {
	protected K key;
	protected V value;
	
	private Cache() {
		
	}
	
	public static <K, V> Cache<K, V> create() {
		return new Cache<K, V>();
	}
	
	public V set(K key, V value) {
		this.key = key;
		this.value = value;
		return value;
	}
	
	public boolean isEmpty() {
		return key == null;
	}
	
	public boolean is(K key) {
		return this.key == key || (this.key != null && this.key.equals(key));
	}
	
	public V get() {
		return value;
	}
}
