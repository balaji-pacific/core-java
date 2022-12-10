/**
 * 
 */
package com.java.core.work.java8.collections.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author balajisoundarrajan
 *
 */
public class StringNumberOfOccurences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "BalajiIsSearchingForAJob";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<str.length();i++) {
			Integer count =  map.get(String.valueOf(str.charAt(i)));
			if(null == count) {
				count = 0;
			}
			if(count>0) {
				map.put(String.valueOf(str.charAt(i)),count + 1);
			}else {
				map.put(String.valueOf(str.charAt(i)),1);
			}
		}

		//System.out.println(map);
		
		HashMap<String, Integer> sortedMap = map.entrySet()
												.stream()
												.sorted((o1,o2) -> o1.getValue().compareTo(o2.getValue()))
												.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, HashMap::new));
		
		
/*		HashMap<String, Integer> hmSorted = map.entrySet()
												.stream()
												.sorted((o1,o2) 
															-> o1.getValue().compareTo(
																	o2.getValue()))
												.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));*/
		
		//System.out.println(sortedMap);
		
		System.out.println(sortedMap.entrySet().stream().findFirst().get());
		
		System.out.println(sortedMap.entrySet().stream().reduce((o1,o2) -> o2).get());
		
		
		
	}

}
