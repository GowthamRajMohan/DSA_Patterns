package io.samcs.twoPointers.sll;

public class RemoveNthLastNode {
	public static SinglyLinkedList.Node remove(SinglyLinkedList.Node head, int n) {
		SinglyLinkedList.Node left = head;
		SinglyLinkedList.Node right = head;

		for(int i = 0; i<n; i++){
			right = right.next;
		}
		if (right == null) {
			return head.next;
		}
		while (right.next != null) {
			right = right.next;
			left = left.next;
		}
		left.next = left.next.next;
		return head;
	}
}
