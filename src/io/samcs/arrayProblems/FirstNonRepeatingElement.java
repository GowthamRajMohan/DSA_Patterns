package io.samcs.arrayProblems;

public class FirstNonRepeatingElement {

	public static int nonRepeatingElement(int [] arr) {
		for (int p1 = 0; p1 < arr.length; p1++) {
			int p2 = 0;
			while (p2 < arr.length) {
				if (arr[p1] == arr[p2] && p1 != p2) {
					break;
				}
				p2++;
			}
			if (p2 == arr.length) {
				return arr[p1];
			}
		}
		return -1;
	}
}
