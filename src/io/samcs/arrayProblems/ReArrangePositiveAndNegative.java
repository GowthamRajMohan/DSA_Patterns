package io.samcs.arrayProblems;

import java.util.Arrays;

public class ReArrangePositiveAndNegative {
	public static void rearrange(int[] arr) {

		int left = 0;
		int right = 0;
		while(right < arr.length) {
			if (arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right++;
				left++;
			}
			else {
				right++;
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
}
