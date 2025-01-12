package io.samcs.twoPointers;

import java.util.Arrays;

public class FindSum {

//	public static int[] findSum(int[] arr, int n) {
//		int [] result = new int [2];
//		for (int i=0; i<arr.length;i++) {
//			for (int j=i+1; j<arr.length;j++) {
//				if (arr[i]+arr[j] == n) {
//					result = new int[]{arr[i], arr[j]};
//					return result;
//				}
//			}
//		}
//		return result;
//	}

	public static int[] findSum(int[] arr, int n) {
		Arrays.sort(arr);
		int [] result = new int[2];
		int left =0;
		int right =arr.length-1;
		while(left < right) {
			if(arr[left] + arr[right] < n){
				left++;
			} else if (arr[left] + arr[right] > n) {
				right--;
			} else {
				result[0]= arr[left];
				result[1]= arr[right];
				return result;
			}
		}
		return new int[0];
	}
}
