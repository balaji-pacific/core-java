package com.java.core.work.java8.collections;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionFrameworkDequeue {

	public static void main(String[] args) {
		
		Deque<String> dequeue = new LinkedList<String>();
		
		
		dequeue.addFirst("Value 1");
		dequeue.addFirst("Value 2");
		dequeue.addFirst("Value 3");
		dequeue.addFirst("Value 4");
		dequeue.addFirst("Value 5");
		dequeue.addFirst("Value 6");
		dequeue.addLast("Value 1");
		dequeue.addLast("Value 2");
		dequeue.addLast("Value 3");
		dequeue.addLast("Value 4");
		dequeue.addLast("Value 5");
		//dequeue.addLast("Value 6");
		
		System.out.println("First : " + dequeue.getFirst());
		System.out.println("Last : " + dequeue.getLast());
		dequeue.pop();
		dequeue.push("Value 6");
		
		
		dequeue.stream().forEach(s -> System.out.println(s));


		

	}

}
