package com.java.core.work.failfast.failsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListFailFast {
	
	public static void main(String args[]) {
		
		//File Fast
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator<Integer> iterator = list.iterator();
		
		//while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			//list.add(6);
		//}
		
		
		//FailSafe
		CopyOnWriteArrayList<Integer> listCopy = new CopyOnWriteArrayList<Integer>();
		listCopy.add(1);
		listCopy.add(2);
		listCopy.add(3);
		listCopy.add(4);
		listCopy.add(5);
		
		Iterator<Integer> iterator2 = listCopy.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			listCopy.add(6);
		}
		
	}

}
