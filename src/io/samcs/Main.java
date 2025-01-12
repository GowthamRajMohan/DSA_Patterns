package io.samcs;

import io.samcs.arrayProblems.FirstNonRepeatingElement;
import io.samcs.arrayProblems.ProductOfArrayExceptSelf;
import io.samcs.arrayProblems.ReArrangePositiveAndNegative;
import io.samcs.arrayProblems.RotateList;
import io.samcs.twoPointers.FindSum;
import io.samcs.twoPointers.RemoveNthLastNode;
import io.samcs.twoPointers.SortColours;
import io.samcs.twoPointers.sll.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

//		System.out.println(ValidPalindrome.isPalindrome("ABCBBA"));
//		System.out.println(SumOfThree.isSumOfThree(new int[] { 2,4,5,8,9}, 17));
//		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//		list.insertAtHead(20);
//		list.insertAtHead(30);
//		list.insertAtHead(40);
//		list.insertAtHead(50);
//		list.insertAtHead(60);
//		System.out.println(RemoveNthLastNode.removeNthFromEnd(list.head, 2));
		SortColours.sort(new int[] {2,0,2,1,1,0});
//		System.out.println(ReverseASentence.reverse("World"));
//		System.out.println(ValidPalindromeII.isValidPalindrome("RACEACAR"));
		int [] values = {1,-2,3,-4,5,6};
//		int[] removedEven = removeEven(values);
//		Arrays.stream(removedEven).forEach(System.out::println);
//		SinglyLinkedList linkedList = new SinglyLinkedList();
//		for (int i = 0; i<values.length; i++) {
//			linkedList.insertAtEnd(values[i]);
//		}
//
////		linkedList.createLinkedList(values);
//		linkedList.insertAfter(5, 4);
//		System.out.println(linkedList);
//		SinglyLinkedList.Node linkedListNode = io.samcs.twoPointers.sll.RemoveNthLastNode.remove(linkedList.head, 4);
//		System.out.println(linkedList);
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1,3);
//		FindSum.findSum(values,-15);
//		ProductOfArrayExceptSelf.product(values);
//		System.out.println(FirstNonRepeatingElement.nonRepeatingElement(values));
//		RotateList.rotate(values,3);
//		System.out.println(2%7);
//		System.out.println(values.length);
//		ReArrangePositiveAndNegative.rearrange(values);
//		String s = "9 2 1 * - 8 - 4 +";
//		String[] s1 = s.split(" ", s.length());

//		Map<String, Character> hm = new HashMap<>();

		boolean[] visited = new boolean[5];
		visited[0] = true;
		visited[1] = true;
		visited[2] = false;


	}

//	public static int[] removeEven(int[] arr) {
//
//		int size = 0;
//
//		for (int i=0; i<arr.length; i++) {
//			if (!(arr[i]%2 == 0)){
//				size++;
//			}
//		}
//
//		int[] result = new int[size];
//		int length = 0;
//		for (int i=0; i<arr.length; i++) {
//			if (!(arr[i]%2 == 0)){
//				result[length] = arr[i];
//				length++;
//			}
//		}
//
//		return result;
//
//	}




}