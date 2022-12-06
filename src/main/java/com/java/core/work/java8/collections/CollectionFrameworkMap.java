package com.java.core.work.java8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionFrameworkMap {
	
	public static void main(String args[]) {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Balaji");
		hm.put(5, "Yashika");
		hm.put(8, "Varsha");
		hm.put(2, "Soundarrajan");
		hm.put(4, "Mohan");
		hm.put(6, "Deepa");
		
		hm.entrySet().stream().forEach(kv -> System.out.println(kv.getKey() + " " + kv.getValue()));
		
		Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> kv = iterator.next();
			System.out.println(kv.getKey() + " " + kv.getValue());
		}
		
		hm.entrySet().forEach((k -> System.out.println(k.getKey() + " " + k.getValue())));
		
		hm.keySet().forEach(k -> System.out.println(k));
		
		hm.values().forEach(k -> System.out.println(k));
	}

}
