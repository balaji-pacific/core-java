/**
 * 
 */
package com.java.core.work.java8.streams;

import java.util.ArrayList;
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
		

	}

}
