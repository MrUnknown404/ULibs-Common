package main.java.ulibs.common.utils;

import java.util.ArrayList;
import java.util.List;

public class WeightedList<T> {
	protected final List<Pair<T, Integer>> list = new ArrayList<Pair<T, Integer>>();
	protected int totalWeight;
	
	public void add(T t, int weight) {
		list.add(Pair.of(t, weight));
		totalWeight += weight;
	}
	
	public T get() {
		int idx = 0;
		for (double r = Math.random() * totalWeight; idx < size() - 1; ++idx) {
			r -= list.get(idx).getR();
			if (r <= 0) {
				break;
			}
		}
		
		return list.get(idx).getL();
	}
	
	/** @see List#isEmpty() */
	@SuppressWarnings("javadoc")
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	/** @see List#size() */
	@SuppressWarnings("javadoc")
	public int size() {
		return list.size();
	}
	
	/** @see List#clear() */
	public void clear() {
		list.clear();
	}
}
