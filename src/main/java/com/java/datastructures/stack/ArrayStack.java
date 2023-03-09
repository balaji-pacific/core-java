/**
 * 
 */
package com.java.datastructures.stack;

import java.util.EmptyStackException;

/**
 * @author Balaji Soundarrajan
 *
 */
public class ArrayStack {
	
	int[] stack;
	int top;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayStack arrayStack = new ArrayStack(5);
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(5);
		arrayStack.push(6);
		
		System.out.println(arrayStack.peek());
		
		arrayStack.printStack();
		
	}
	
	public ArrayStack(int capacity) {
		stack = new int[capacity];
	}
	
	/**
	 * Inserting element to the top of the stack.
	 * If the top and size of the array is same then increasing the array size to the double of the stack
	 * @param data
	 */
	public void push(int data) {
		if(top == stack.length) {
			int[] newStack = new int[2* stack.length];
			System.arraycopy(stack, 0, newStack, 0, stack.length);
			stack = newStack;
		}
		stack[top] = data;
		top++;
	}
	
	/**
	 * Removing the top element
	 * @return
	 */
	public int pop() {
		if(top == 0) {
			throw new EmptyStackException();
		}
		int popItem = stack[--top];
		return popItem;
	}
	
	/**
	 * Fetching the top element in the stack
	 * @return int top
	 */
	public int peek() {
		if(top == 0) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	/**
	 * Printing the content of the stack
	 */
	public void printStack() {
		System.out.println("Top ->");
		for(int i=top-1; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}

}
