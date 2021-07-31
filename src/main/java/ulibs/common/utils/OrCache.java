package main.java.ulibs.common.utils;

public class OrCache<K0, K1, V> extends Cache<K0, V> {
	protected K1 key1;
	
	public void set(K0 key0, K1 key1, V value) {
		super.set(key0, value);
		this.key1 = key1;
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && key1 == null;
	}
	
	public boolean is(K0 key0, K1 key1) {
		return (this.key == key0 || (this.key != null && this.key.equals(key0))) || (this.key1 == key1 || (this.key1 != null && this.key1.equals(key1)));
	}
	
	/** Use {@link #set(Object, Object, Object)} instead */
	@Deprecated
	@Override
	public void set(K0 key, V value) {
		
	}
	
	/** Use {@link #is(Object, Object)} instead */
	@Deprecated
	@Override
	public boolean is(K0 key) {
		return false;
	}
}
