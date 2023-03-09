/**
 * 
 */
package com.java.datastructures.doubly.linkedlist;

/**
 * @author Balaji Soundarrajan
 * This class is created for Doubly Linked List 
 */
public class DoublyLinkedList {
	
	Node head;
	Node tail;
	static int size;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addToEnd(1);
		doublyLinkedList.addToEnd(2);
		doublyLinkedList.addToEnd(3);
		doublyLinkedList.addToEnd(4);
		doublyLinkedList.addToEnd(5);
		doublyLinkedList.addToEnd(6);
		
		doublyLinkedList.addToFront(11);
		doublyLinkedList.addToFront(12);
		doublyLinkedList.addToFront(13);
		doublyLinkedList.addToFront(14);
		doublyLinkedList.addToFront(15);
		doublyLinkedList.addToFront(16);

		System.out.println("From Head to Tail");
		doublyLinkedList.traverseFromFrontToEnd();
		
		System.out.println("\nSize : " + size);
		
		System.out.println("From Tail to Head");
		doublyLinkedList.traverseFromEndToFront();
		
		System.out.println("\nRemoving node from Tail");
		doublyLinkedList.removeNodeTail();
		doublyLinkedList.removeNodeTail();
		doublyLinkedList.removeNodeTail();
		doublyLinkedList.traverseFromFrontToEnd();
		System.out.println("\nSize : " + size);
	}
	
	/**
	 * This method created for Adding the new element in the end of the list
	 * @param data
	 */
	public void addToEnd(int data) {
		
		Node insertNode = new Node(data);
		
		if(head == null) {
			head = tail = insertNode;
		}else {
			tail.next = insertNode;
			insertNode.prev = tail;
			tail = insertNode;
			
		}
		size ++;
	}
	
	/**
	 * This method created for adding the new element in the front of the list
	 * @param data
	 */
	public void addToFront(int data) {
		Node insertNode = new Node(data);
		
		if(head == null) {
			head = tail = insertNode;
		}else {
			head.prev = insertNode;
			insertNode.next = head;
			head = insertNode;
		}
		size ++;
	}
	
	/**
	 * This method is traverse element from front to end
	 */
	public void traverseFromFrontToEnd() {
		Node currentNode;
		
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			currentNode = head;
			System.out.print("HEAD -> ");
			while(currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.next;
			}
			System.out.print(" <- TAIL");
		}
	}
	
	/**
	 * This method is traverse element from end to front
	 */
	public void traverseFromEndToFront() {
		Node currentNode;
		
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			currentNode = tail;
			System.out.print("TAIL -> "); 
			while(currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.prev;
			}
			System.out.print(" <- HEAD");
		}
	}
	
	/**
	 * Remove the element from Front side of the list
	 */
	public void removeNodeFront() {
		
		if(head == null) {
			System.out.println("List is empty");
		}else {
			head = head.next;
			head.prev = tail.next;
			size --;
		}
	}
	
	/**
	 * Remove the element from the back side of the list
	 */
	public void removeNodeTail() {
		if(head == null) {
			System.out.println("List is empty");
		}else {
			tail = tail.prev;
			tail.next = head.prev;
			size --;
		}
	}

}
