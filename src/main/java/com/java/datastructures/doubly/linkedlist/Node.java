/**
 * 
 */
package com.java.datastructures.doubly.linkedlist;

/**
 * @author Balaji Soundarrajan
 *
 */
public class Node {
	
	int data;
	Node prev;
	Node next;
	
	
	
	/**
	 * @param data
	 */
	public Node(int data) {
		super();
		this.data = data;
		this.prev = null;
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
	 * @return the prev
	 */
	public Node getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
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
