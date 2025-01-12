package io.samcs.twoPointers.sll;

public class SinglyLinkedList<T> {

	public class Node {
		public T data;
		public Node next;
		// Constructor will be used to make a LinkedListNode type object
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;
	public int size;
	// constructor will be used to make a LinkedList type object
	public SinglyLinkedList() {
		this.head = null;
	}
	// insertNodeAtHead method will insert a LinkedListNode at head
	// of a linked list.
	public void insertAtHead(T data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void insertAtEnd(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}
	// createLinkedList method will create the linked list using the
	// given integer array with the help of InsertAthead method.
//	public void createLinkedList(T[] lst) {
//		for (int i = lst.length - 1; i >= 0; i--) {
//			Node newNode = new Node(lst[i]);
//			insertNodeAtHead(newNode);
//		}
//	}

	public void insertAfter(T data, T prevData) {
		Node newNode = new Node(data);
		Node current = head;
		while (current != null && !(current.data == prevData)) {
				current = current.next;
		}
		if (current != null) {
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}

	public void deleteByValue(T data) {
		if (isEmpty()) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			size--;
			return;
		}
		Node currentNode = head;
		Node previousNode = null;

		while (currentNode != null) {
			if (currentNode.data == data) {
				previousNode.next = currentNode.next;
				size--;
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
}
