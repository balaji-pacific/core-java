/**
 * 
 */
package com.java.datastructures.linkedlist;

/**
 * @author Balaji Soundarrajan
 *
 */
public class SinglyLinkedList {
	
	private Node head;
	private Node tail;
	private static int size=0;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node value1 = new Node(5);
		Node value2 = new Node(2);
		Node value3 = new Node(53);
		Node value4 = new Node(55);
		Node value5 = new Node(785);
		Node value6 = new Node(235);
		Node value7 = new Node(905);
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addToListToTail(value1);
		singlyLinkedList.addToListToTail(value2);
		singlyLinkedList.addToListToTail(value3);
		singlyLinkedList.addToListToTail(value4);
		singlyLinkedList.addToListToTail(value5);
		singlyLinkedList.addToListToTail(value6);
		singlyLinkedList.addToListHead(value7);
		
		System.out.println("Size of the Singly Linked list : " + size);
		
		singlyLinkedList.printList();

	}
	
	
	public void addToListToTail(Node node) {
		if(head == null) {
			System.out.println("Singly Linked List is empty");
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public void addToListHead(Node node) {
		if(head == null) {
			System.out.println("Singly Linked List is empty");
			head = node;
			tail = node;
		}else {
			node.next = head;
			head = node;
		}
		size++;
	}
	
	public void printList() {
		
		Node currentNode = head;
		
		if(currentNode == null) {
			System.out.println("Singly Linked List is empty");
		}
		
		System.out.println("Linked List value : ");
		System.out.print("HEAD -> ");
		while(currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.next;
		}
		System.out.println(" <- TAIL");
	}
	
}
