/**
 * 
 */
package com.java.datastructures.singly.linkedlist;

/**
 * @author Balaji Soundarrajan This class created for Example program of Singly
 *         linked list
 */
public class SinglyLinkedList {

	private Node head;
	private Node tail;
	private static int size = 0;

	/**
	 * 
	 * Main program of Singly linked list Adding data at the head Adding data at end
	 * Traversing data
	 * 
	 * @param args
	 * 
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

		System.out.println("First Node : " + singlyLinkedList.getFirstNode().getData());
		System.out.println("Last Node : " + singlyLinkedList.getLastNode().getData());

		Node removedNode = singlyLinkedList.removeNode(905);
		System.out.println("Node Removed : " + removedNode);
		removedNode = null;

		System.out.println("Size of the Singly Linked list : " + size);

		singlyLinkedList.printList();

		removedNode = singlyLinkedList.removeNode(53);
		System.out.println("Node Removed : " + removedNode);
		removedNode = null;

		System.out.println("Size of the Singly Linked list : " + size);

		singlyLinkedList.printList();
		
		removedNode = singlyLinkedList.removeNode(888);

	}

	/**
	 * Adding data at the end (i.e)
	 * 
	 * @param node, contains inserting data
	 */
	public void addToListToTail(Node node) {
		if (head == null) {
			System.out.println("Singly Linked List is empty");
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	/**
	 * Adding data at the beginning
	 * 
	 * @param node, contains inserting data
	 */
	public void addToListHead(Node node) {
		if (head == null) {
			System.out.println("Singly Linked List is empty");
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	/**
	 * Traversing the singly linked list starting from head to tail
	 */
	public void printList() {
		Node currentNode = head;

		if (currentNode == null) {
			System.out.println("Singly Linked List is empty");
		}

		System.out.println("Linked List value : ");
		System.out.print("HEAD -> ");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.next;
		}
		System.out.println(" <- TAIL");
	}

	/**
	 * Returns the First Node in the Singly Linked list
	 * @return
	 */
	public Node getFirstNode() {
		if (size > 0) {
			return head;
		} else {
			System.out.println("List is empty so return null");
			return null;
		}

	}

	/**
	 * Returns the last node in the Singly Linked list
	 * @return
	 */
	public Node getLastNode() {
		if (size > 0) {
			return tail;
		} else {
			System.out.println("List is empty so return null");
			return null;
		}

	}

	/**
	 * Remove the data from the singly linked list
	 * @param removeValue
	 * @return Removed Node and if the value is not present then it return null.
	 */
	public Node removeNode(int removeValue) {
		Node removedNode = null;
		Node tempNode = null;
		Node previousNode = null;
		if (size == 0) {
			System.out.println("Singly Linked List is empty");
		}

		// If head is the data that needs to be removed
		if (head.getData() == removeValue) {
			System.out.println("Value found its a HEAD");
			removedNode = head;
			head = head.getNext();
			size--;
			return removedNode;
		}
		// If the value is not head and its available in the list
		tempNode = head;
		while (tempNode.getData() != removeValue) {
			
			//DAta not available in the list and already reached the  
			if(tempNode == tail) {
				System.out.println("Data not available");
				return null;
			}
			previousNode = tempNode;
			tempNode = tempNode.getNext();
			if (tempNode.getData() == removeValue) {
				removedNode = tempNode;
				previousNode.setNext(tempNode.getNext());
				size--;
				return removedNode;
			}
		}
		return null;
	}

}
