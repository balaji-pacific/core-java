/**
 * 
 */
package com.java.datastructures.stack;

/**
 * @author Balaji Soundarrajan
 *
 */
public class StackNode {
	
	String value;
	StackNode next;
	
	
	
	/**
	 * @param value
	 */
	public StackNode(String value) {
		super();
		this.value = value;
		next = null;
	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public StackNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(StackNode next) {
		this.next = next;
	}
	
	

}
