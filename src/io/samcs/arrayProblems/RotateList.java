package io.samcs.arrayProblems;

public class RotateList {
	public static int[] rotate(int[] nums, int k) {
		for (int i=1; i<k ;i++) {
			int lastElement = nums[nums.length-1];
			int p = nums.length - 1;
			while(p > 0) {
				nums[p] = nums[p-1];
				p--;
			}
			nums[0] = lastElement;
		}
		return nums;
	}
}
