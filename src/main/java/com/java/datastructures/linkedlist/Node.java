/**
 * 
 */
package com.java.datastructures.linkedlist;

/**
 * @author Balaji Soundarrajan
 *
 */
public class Node {
	
	int data;
	Node next;
	
	
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	

}
