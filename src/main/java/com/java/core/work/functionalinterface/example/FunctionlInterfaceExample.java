package com.java.core.work.functionalinterface.example;

import java.util.ArrayList;
import java.util.List;

public class FunctionlInterfaceExample{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Predicate Example - Has Argument and return Boolean
		List<String> list = new ArrayList<String>();
		list.add("Balaji Soundarrajan");
		list.add("Bala");
		list.add("Yashika");
		
		PredicateInterface predicateInterface = (List<String> listPI) -> {
			if(listPI.size() > 0) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println("The list has value : " + predicateInterface.isTrue(list));
		
		//Consumer Example - Has Argument and no return value
		ConsumerInterface consumerInterface = (List<String> listCI) -> {
			listCI.forEach(s -> System.out.println(s));
		};
		consumerInterface.iterate(list);
		
		//Function Interface - Has Argument and Return Type
		List<String> sorted = new ArrayList<String>();
		FunctionInterface functionInterface = (List<String> listFI) -> {
			listFI.forEach(s -> {
				if(s.startsWith("B")) {
					sorted.add(s);
				}
			});
			return sorted;
		};
		functionInterface.startsWith(list);
		
		sorted.forEach(s -> System.out.println(s));
		
		
		//Supplier Example -> Has no argument and return value
		
		SupplierInterface supplierInterface = () -> Math.random();
		System.out.println(supplierInterface.getRandomValue().toString());

	}
}
