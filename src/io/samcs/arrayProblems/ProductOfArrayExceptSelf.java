package io.samcs.arrayProblems;

public class ProductOfArrayExceptSelf {

	public static int [] product(int [] arr) {
		int left = 1;
		int[] product = new int[arr.length];

		for (int i=0; i< arr.length; i++) {
			product[i] = left;
			left *= arr[i];
		}

		int right = 1;
		for (int j= arr.length-1; j>=0; j--) {
			product[j] *= right;
			right *= arr[j];
		}
		return product;
	}
}
