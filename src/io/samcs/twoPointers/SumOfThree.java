package io.samcs.twoPointers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SumOfThree {

	public static boolean isSumOfThree(int[] nums, int target){
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			int low = i+1;
			int high = nums.length - 1;
			while (low < high) {
				if (nums[i] + nums[low] + nums[high] == target) {
					System.out.println("Found: " + nums[i] + " " + nums[low] + " " + nums[high]);
					return true;
				} else if (nums[i] + nums[low] + nums[high] < target) {
					low++;
				} else {
					high--;
				}
			}
		}
		return false;
	}
}
