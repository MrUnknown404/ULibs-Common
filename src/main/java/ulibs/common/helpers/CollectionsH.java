package main.java.ulibs.common.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsH {
	public static <E> List<E> fill(int size, E e) {
		List<E> list = new ArrayList<E>();
		for (int i = 0; i < size; i++) {
			list.add(e);
		}
		
		return list;
	}
	
	public static <E> ArrayList<E> copyList(ArrayList<E> list) {
		return new ArrayList<E>(list);
	}
	
	public static <E> List<E> copyList(List<E> listToCopy, List<E> listToPaste) {
		listToPaste.addAll(listToCopy);
		return listToPaste;
	}
	
	public static <E> HashSet<E> copySet(HashSet<E> set) {
		return new HashSet<E>(set);
	}
	
	public static <E> Set<E> copySet(Set<E> setToCopy, Set<E> setToPaste) {
		setToPaste.addAll(setToCopy);
		return setToPaste;
	}
	
	public static <K, V> HashMap<K, V> copyMap(HashMap<K, V> map) {
		HashMap<K, V> newMap = new HashMap<K, V>();
		newMap.putAll(map);
		return newMap;
	}
	
	public static <K, V> LinkedHashMap<K, V> copyMap(LinkedHashMap<K, V> map) {
		LinkedHashMap<K, V> newMap = new LinkedHashMap<K, V>();
		newMap.putAll(map);
		return newMap;
	}
	
	public static <K, V> Map<K, V> copyMap(Map<K, V> mapToCopy, Map<K, V> mapToPaste) {
		mapToPaste.putAll(mapToCopy);
		return mapToPaste;
	}
}
