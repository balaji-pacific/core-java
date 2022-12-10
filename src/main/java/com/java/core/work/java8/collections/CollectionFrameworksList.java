/**
 * 
 */
package com.java.core.work.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

/**
 * @author balajisoundarrajan
 *
 */
public class CollectionFrameworksList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//ArrayList
		System.out.println("ArrayList");
		List<Integer> arrayListType = new ArrayList<Integer>();
		arrayListType = CollectionFrameworksList.initializeList(arrayListType);
		arrayListType.stream().forEach(s->System.out.print(" " + s));
		
		//LinkedList
		System.out.println("\n" + "LinkedList");
		List<Integer> linkedListType = new LinkedList<Integer>();
		linkedListType = CollectionFrameworksList.initializeList(linkedListType);
		linkedListType.stream().forEach(s->System.out.print(" "+s));
		
		
		//Reverse
		System.out.println("\n" + "Reversing the Linked list");
		Collections.reverse(linkedListType);
		linkedListType.stream().forEach(s->System.out.print(" " + s));
		
		//Splititerator
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Balaji");
		aList.add("Soundarrajan");
		aList.add("Kamala");
		aList.add("Vasuki");
		aList.add("Mohan");
		aList.add("Deepa");
		aList.add("Yashika");
		
		Spliterator<String> split1 = aList.spliterator();
		Spliterator<String> split2 = split1.trySplit();
		Spliterator<String> split3 = split2.trySplit();
		
		//System.out.println("\n" + "Split 1");
		split1.forEachRemaining(s -> System.out.println(s));
		
		//System.out.println("Split 2");
		split2.forEachRemaining(s -> System.out.println(s));
		
		//System.out.println("Split 3");
		split3.forEachRemaining(s -> System.out.println(s));
		
		
		System.out.println("Iterator");
		Iterator<String> iterator = aList.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			
		}
	}
	
	public static List<Integer> initializeList(List<Integer> list) {
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		return list;
	}

}
