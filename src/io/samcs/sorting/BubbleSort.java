package io.samcs.sorting;

public class BubbleSort {

	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			var j=i+1;
			if (nums[j] < nums[i]) {
				var temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}

		}
	}
}
