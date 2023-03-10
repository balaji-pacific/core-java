/**
 * 
 */
package com.java.datastructures.stack;

import java.util.EmptyStackException;

/**
 * 
 * Stack program using linked list 
 * @author Balaji Soundarrajan
 *
 */
public class ArrayLinkedList {

	int length;
	StackNode top;
	
	
	public ArrayLinkedList() {
		top = null;
		length = 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayLinkedList arrayLinkedList = new ArrayLinkedList();
		arrayLinkedList.push("Balaji");
		arrayLinkedList.push("Soundarrajan");
		arrayLinkedList.push("Vasuki");
		arrayLinkedList.push("Kamala");
		arrayLinkedList.push("Mohan");
		arrayLinkedList.push("Deepa");
		
		arrayLinkedList.printStack();
		
		arrayLinkedList.pop();
		
		System.out.println( "Peek value : " + arrayLinkedList.peek().getValue());

	}
	
	/**
	 * Adding the element into top of the stack
	 * @param data
	 */
	public void push(String data) {
		StackNode sn = new StackNode(data);
		sn.setNext(top);
		top = sn;
		length ++;
	}
	
	/**
	 * Deleting the top valu and make the next value as top
	 * @return
	 */
	public StackNode pop() {
		StackNode data = null;
		if(length == 0) {
			System.out.println("Stack is empty");
		}else {
			data = top;
			top = top.getNext();
			length --;
		}	
		return data;
	}
	
	/**
	 * Fetching the top value
	 * @return
	 */
	public StackNode peek() {
		if(length == 0) {
			throw new EmptyStackException();
		}
		return top;
	}
	
	/**
	 * Printing the stack value
	 */
	public void printStack() {
		if(length == 0) {
			throw new EmptyStackException();
		}
		StackNode current = top;
		System.out.println("Top -> ");
		while(current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
}
