/**
 * 
 */
package com.java.core.work.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author balajisoundarrajan
 *
 */
public class ComparableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<EmployeeComparable> al =  (ArrayList<EmployeeComparable>) Stream.of(
				new EmployeeComparable("Balaji", Double.valueOf(2000)),
				new EmployeeComparable("Soundarrajan", Double.valueOf(2000)),
				new EmployeeComparable("Kamala", Double.valueOf(2000)),
				new EmployeeComparable("AShwin", Double.valueOf(2000))
				).collect(Collectors.toList());
		
		Collections.sort(al);
		
		System.out.println("After Sorting");
		al.forEach(s -> System.out.println(s));
		
		
	}

}
