package com.java.core.work.java8.collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionFrameWorkSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Balaji");
		ts.add("Soundarrajan");
		ts.add("Kamala");
		ts.add("Vasuki");
		ts.add("Mohan");
		ts.add("Deepa");
		ts.add("Yashika");
		
		//System.out.println("TreeSet");
		//ts.stream().forEach(s->System.out.print(" "+s));
		
		
		SortedSet<String> ss = new TreeSet<String>();
		ss.add("Balaji");
		ss.add("Soundarrajan");
		ss.add("Kamala");
		ss.add("Vasuki");
		ss.add("Mohan");
		ss.add("Deepa");
		ss.add("Yashika");
		
		//System.out.println("Tail Set From Vasuki");
		//ss.tailSet("Vasuki").stream().forEach(s->System.out.print(" " + s));
		
		//System.out.println("Subset b/w Kamala & Vasuki");
		//ss.subSet("Kamala", "Vasuki").stream().forEach(s->System.out.print(" " + s));
		
		//System.out.println("\n"+"SortedSet");
		//ss.stream().forEach(s -> System.out.print(" "+s));
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Balaji");
		hs.add("Soundarrajan");
		hs.add("Kamala");
		hs.add("Vasuki");
		hs.add("Mohan");
		hs.add("Deepa");
		hs.add("Yashika");
		
		NavigableSet<String> ns = new TreeSet<String>();
		ns.add("Balaji");
		ns.add("Soundarrajan");
		ns.add("Kamala");
		ns.add("Vasuki");
		ns.add("Mohan");
		ns.add("Deepa");
		ns.add("Yashika");
		
		System.out.println("Ceiling : " + ns.ceiling("Varsha"));
		//Descending Iterator
		ns.descendingIterator().forEachRemaining(s -> System.out.println(s));
		
		System.out.println("First : " + ns.first());
		System.out.println("First : " + ns.descendingSet().first());
		
		

	}

}
