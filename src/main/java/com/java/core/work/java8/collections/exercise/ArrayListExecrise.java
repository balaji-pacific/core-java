/**
 * 
 */
package com.java.core.work.java8.collections.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balaji soundarrajan
 *
 */
public class ArrayListExecrise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<String>();
		aList.add("Value 1");
		aList.add("Value 2");
		aList.add("Value 3");
		aList.add("Value 4");
		aList.add("Value 5");
		aList.add("Value 6");
		
		String[] arrayStr = new String[aList.size()];
		
		arrayStr = aList.toArray(arrayStr);
		
		for(String s : arrayStr) {
			System.out.println(s);
		}
		
		List<String> l = Arrays.asList(arrayStr);
		
		LinkedList<String> al = new LinkedList<String>(l);
		
		System.out.println(al);

	}

}
