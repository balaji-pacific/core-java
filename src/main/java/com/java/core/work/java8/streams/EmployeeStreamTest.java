/**
 * 
 */
package com.java.core.work.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author balajisoundarrajan
 *
 */
public class EmployeeStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<EmployeeStream> employeeList = new ArrayList<EmployeeStream>();
		employeeList.add(new EmployeeStream("Balaji", Double.valueOf(5000)));
		employeeList.add(new EmployeeStream("Yashika", Double.valueOf(1000)));
		employeeList.add(new EmployeeStream("Mohan", Double.valueOf(15000)));
		employeeList.add(new EmployeeStream("Vasuki", Double.valueOf(12000)));
		employeeList.add(new EmployeeStream("Deepa", Double.valueOf(7000)));
		employeeList.add(new EmployeeStream("Kamala", Double.valueOf(12000)));
		employeeList.add(new EmployeeStream("Lakshmi", Double.valueOf(7000)));
		
		
		//Print the name of the employee who is earning more than 5000
		employeeList.stream().filter(emp -> emp.getSalary() > 5000).map(name -> name.getName()).forEach(System.out::println);
		
		
		//Print only the count of the employee who is earning more than 5000
		Long count =  employeeList.stream().filter(emp -> emp.getSalary() > 5000).map(EmployeeStream :: getName).collect(Collectors.counting());
		System.out.println(count);
		
		//Print all the Employee name stroed in a list
		ArrayList<String> list = (ArrayList<String>) employeeList.stream().map(EmployeeStream::getName).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		//Return the value as comma seperated
		String employees = employeeList.stream().map(emp -> emp.getName()).collect(Collectors.joining(","));
		System.out.println(employees);
		
		
		//Grouping by Salary
		employeeList.stream().collect(Collectors.groupingBy(EmployeeStream :: getSalary)).forEach((k,v) -> System.out.println("Key : " + k + "Value : " + v));
		
		
		//Average of all the employee
		System.out.println("Average Salary of all the employees : " + employeeList.stream().collect(Collectors.averagingDouble(EmployeeStream :: getSalary)));
		

		//Get only the employee who has salary more than 5000.
		employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 5000)).forEach((k,v) -> System.out.println("Key : " + k + " Value : " + v));
		
		
	}

}
