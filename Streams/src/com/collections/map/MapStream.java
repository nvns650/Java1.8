package com.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("India", 2);
		map.put("Us", 1);
		map.put("Canda", 4);
		map.put("Russia", 3);
		map.put("India", 6);
		System.out.println("sysout= "+map);
		// (oldKey, newKey) if duplicate exist will go for oldkey
		Map<String, Integer> afterStream = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue));
		System.out.println(afterStream);
		System.out.println("----------------------------");
		
		Map<String, Integer> afterStream3 = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue));
		System.out.println(afterStream3);
		System.out.println("----------------------------");
		
			
		//no need old new and hashMap::new
		Map<String, Integer> afterStream2 = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(afterStream2);
		System.out.println("----------------------------");
		Map<String, Integer> map2 = new HashMap<>();
		map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
				.forEachOrdered(x -> map2.put(x.getKey(), x.getValue()));
		System.out.println(map2);
		System.out.println("----------------------------");
		Map<String,Integer> map3=map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map3);
		System.out.println("----------------------------");
		//joining in map
		String joinin=map.entrySet().stream().filter(m -> ("India".equals(m.getKey()))).map(m -> m.getKey()).collect(Collectors.joining());
		System.out.println(joinin);
		
	}
	
}
