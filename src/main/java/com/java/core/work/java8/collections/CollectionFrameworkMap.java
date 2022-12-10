package com.java.core.work.java8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CollectionFrameworkMap {
	
	public static void main(String args[]) {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
//		hm.put(1, "Balaji");
//		hm.put(5, "Yashika");
//		hm.put(8, "Varsha");
//		hm.put(2, "Soundarrajan");
//		hm.put(4, "Mohan");
//		hm.put(6, "Deepa");
		
		hm.entrySet().stream().forEach(mapEntry -> System.out.println(mapEntry.getKey() + " " + mapEntry.getValue()));
		
		hm.entrySet().stream().filter(mapEntry -> mapEntry.getValue().equals("Deepa")).forEach(s -> System.out.println(s.getKey()));
		
		Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> kv = iterator.next();
			System.out.println(kv.getKey() + " " + kv.getValue());
		}
		
		hm.entrySet().forEach((k -> System.out.println(k.getKey() + " " + k.getValue())));
		
		hm.keySet().forEach(k -> System.out.println(k));
		
		hm.values().forEach(k -> System.out.println(k));
		
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Balaji");
		tm.put(5, "Yashika");
		tm.put(8, "Varsha");
		tm.put(2, "Soundarrajan");
		tm.put(4, "Mohan");
		tm.put(6, "Deepa");
		
		System.out.println("First Entry : " + tm.firstEntry());
		System.out.println("Last Entry : " + tm.lastEntry());
		System.out.println("Ceiling Entry : " + tm.ceilingEntry(4));
		
		
	}

}
