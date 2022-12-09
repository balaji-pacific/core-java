/**
 * 
 */
package com.java.core.work.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author balaji soundarrajan
 *
 */
public class ComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = (ArrayList<Employee>) Stream.of(
				new Employee("Balaji", Double.valueOf(20000)),
				new Employee("Yashika", Double.valueOf(200)),
				new Employee("Mohan", Double.valueOf(120000)),
				new Employee("Oliver", Double.valueOf(30000)),
				new Employee("Deepa", Double.valueOf(30))
				).collect(Collectors.toList());
		
		System.out.println("Before Sorting");
		employeeList.forEach(s -> System.out.println("\n" + s));
		
		Collections.sort(employeeList, new SortUsingName());
		
		System.out.println("Sorting By Name");
		employeeList.forEach(s -> System.out.println("After Sorting\n" + s));
		
		
		Collections.sort(employeeList, new SortBySalary());
		
		System.out.println("Sorting By Salary");
		employeeList.forEach(s -> System.out.println("After Sorting\n" + s));
		

	}

}
