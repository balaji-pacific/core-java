/**
 * 
 */
package com.java.datastructures.doubly.queue;

import java.util.NoSuchElementException;

/**
 * 
 * Queue implementation in java
 * @author Balaji Soundarrajan
 *
 */
public class QueueArray {
	
	
	Integer[] queue;
	Integer front=0;
	Integer back=0;
	
	/**
	 * Initializating queue object
	 * @param capacity
	 */
	public QueueArray(Integer capacity){
		queue = new Integer[capacity];
	}
	
	
	/**
	 * Adding element in the queue
	 * @param data
	 */
	public void enqueue(Integer data) {
		if(back == queue.length) {
			Integer[] newQueue = new Integer[2 * queue.length];
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue = newQueue;
		}else {
			queue[back] = data;
			back++;
		}
	}
	
	/** 
	 * Removing element in the queue
	 * @return
	 */
	public Integer dequeue() {
		Integer data = 0;
		if(back - front == 0) {
			throw new NoSuchElementException();
		}else {
			data = queue[front];
			queue[front] = (Integer) null;
			front++;
			if((front - back) == 0) {
				front = back = 0;
			}
		}
		return data;
	}
	
	/**
	 * Returning the element in the front of the queue
	 * @return
	 */
	public Integer peek() {
		int data;
		if(back - front == 0) {
			throw new NoSuchElementException();
		}else {
			data = queue[front];
		}
		return data;
	}
	
	/**
	 * Printing the queue
	 */
	public void printQueue() {
		if(back - front == 0) {
			throw new NoSuchElementException();
		}else {
			for(int i=front ; i<back; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueArray queueArray = new QueueArray(10);
		queueArray.enqueue(10);
		queueArray.enqueue(20);
		queueArray.enqueue(30);
		queueArray.enqueue(40);
		queueArray.enqueue(50);
		queueArray.enqueue(60);
		
		//queueArray.printQueue();
		
		queueArray.dequeue();
		
		queueArray.printQueue();
		
		System.out.println(queueArray.peek());

	}

}
