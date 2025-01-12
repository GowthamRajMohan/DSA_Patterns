package io.samcs.linkedlistProblems;

public class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}

	public LinkedListNode() {
		this.data = null;
		this.next = null;
	}

	public int length(LinkedListNode<T> head) {
		int length = 0;
		LinkedListNode<T> current = head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public void print(LinkedListNode<T> head) {
		LinkedListNode<T> current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public LinkedListNode<T> insertAtHead(LinkedListNode<T> head, T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		newNode.next = head;
		head = newNode;
		return head;
	}

	public LinkedListNode<T> insertAtEnd(LinkedListNode<T> head, T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		LinkedListNode<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
}
