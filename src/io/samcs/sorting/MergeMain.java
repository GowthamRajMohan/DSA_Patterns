package io.samcs.sorting;

import java.util.Arrays;

public class MergeMain {

	public static void main(String[] args) {
		int [] nums = {6,4,3,9,2,1,8};

		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(nums,0, nums.length-1);
		Arrays.stream(nums).forEach(System.out::print);
	}
}
