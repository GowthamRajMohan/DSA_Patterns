package io.samcs.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static int[] merge(int[] array1, int[] array2) {
		int [] result = new int[array1.length + array2.length];
		int i = 0, j = 0, k=0;
		while(i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) {
					result[k] = array1[i];
					k++;
					i++;
			} else {
				result[k] = array2[j];
				k++;
				j++;
			}
		}
		while(i < array1.length) {
			result[k] = array1[i];
			k++;
			i++;
		}
		while(j < array2.length) {
			result[k] = array2[j];
			k++;
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,5,7,9};
		int[] arr2 = {2,4,6,8,9,10};
		Arrays.stream(merge(arr1, arr2)).forEach(System.out::print);
	}
}
