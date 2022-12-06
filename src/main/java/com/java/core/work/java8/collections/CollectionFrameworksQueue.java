package com.java.core.work.java8.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFrameworksQueue {
	
	private static Queue<String> queue = new LinkedList<String>();
	public static void main(String arg[]) {
		
		int value = 0;
		
		do {
			System.out.println("Queue Manipulation");
			System.out.println("1. Print the queue value");
			System.out.println("2. Push");
			System.out.println("3. Pop");
			System.out.println("4. Exit");
			Scanner sc= new Scanner(System.in);
			value = sc.nextInt();
			
			switch(value) {
			case 1:
				CollectionFrameworksQueue.print();
			case 2:
				System.out.println("Enter the value : ");
				Scanner scin= new Scanner(System.in);
				CollectionFrameworksQueue.push(scin.next());
			case 3:
				CollectionFrameworksQueue.pop();
			case 4:
				System.exit(0);
			}
			
		}while(value != 4);
		
		
	}
	
	public static void push(String value) {
		if(queue != null) {
			queue.add(value);
			System.out.println("Value pushed");
		}else {
			queue = new LinkedList<String>();
			queue.add(value);
			System.out.println("Value pushed");
		}
		
	}
	
	public static void pop() {
		if(!queue.isEmpty()) {
			queue.remove();
		}else {
			System.out.println("Queue is Empty");
		}
	}
	
	public static void print() {
		if(!queue.isEmpty()) {
			queue.stream().forEach(s -> System.out.print("\n " + s));
		}else {
			System.out.println("Queue is Empty");
		}
	}
	

}
