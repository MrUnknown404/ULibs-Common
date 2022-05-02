package main.java.ulibs.common.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/** A bunch of utility methods involving various collections
 * @author -Unknown-
 */
public class CollectionsH {
	/** Creates a new {@link ArrayList} with the provided size filled with the provided object
	 * @param size The amount of objects to add to the list
	 * @param e The object to fill the list with
	 * @return A new list filled to the given size with object
	 */
	public static <E> List<E> fill(int size, E e) {
		List<E> list = new ArrayList<E>();
		for (int i = 0; i < size; i++) {
			list.add(e);
		}
		
		return list;
	}
	
	/** Creates a new {@link ArrayList} with the same values of the provided list
	 * @param list The list to copy
	 * @return A new ArrayList with the same values of the given list
	 */
	public static <E> ArrayList<E> copyList(ArrayList<E> list) {
		return new ArrayList<E>(list);
	}
	
	/** Creates a new {@link HashSet} with the same values of the provided set
	 * @param set The set to copy
	 * @return A new HashSet with the same values of the given set
	 */
	public static <E> HashSet<E> copySet(HashSet<E> set) {
		return new HashSet<E>(set);
	}
	
	/** Creates a new {@link HashMap} with the same values of the provided map
	 * @param map The map to copy
	 * @return A new HashMap with the same values of the given map
	 */
	public static <K, V> HashMap<K, V> copyMap(HashMap<K, V> map) {
		HashMap<K, V> newMap = new HashMap<K, V>();
		newMap.putAll(map);
		return newMap;
	}
	
	/** Creates a new {@link LinkedHashMap} with the same values of the provided map
	 * @param map The map to copy
	 * @return A new LinkedHashMap with the same values of the given map
	 */
	public static <K, V> LinkedHashMap<K, V> copyMap(LinkedHashMap<K, V> map) {
		LinkedHashMap<K, V> newMap = new LinkedHashMap<K, V>();
		newMap.putAll(map);
		return newMap;
	}
	
	public static <T> List<T> toList(T[] toAdd) {
		List<T> list = new ArrayList<T>();
		for (T w : toAdd) {
			list.add(w);
		}
		return list;
	}
	
	public static <T> List<T> toList(T toAdd, T[] toAdds) {
		List<T> list = new ArrayList<T>(Arrays.asList(toAdd));
		for (T w : toAdds) {
			list.add(w);
		}
		return list;
	}
}
