package io.samcs.linkedlistProblems;

public class LLMain {

	public static void main(String[] args) {
		LinkedListNode<Integer> linkedListNode= new LinkedListNode<>();
		linkedListNode.insertAtEnd(linkedListNode, 2);
		linkedListNode.insertAtEnd(linkedListNode, 4);
		linkedListNode.insertAtEnd(linkedListNode, 6);
		linkedListNode.insertAtEnd(linkedListNode, 8);
		linkedListNode.print(linkedListNode);
		System.out.println(linkedListNode.length(linkedListNode));
	}
}
