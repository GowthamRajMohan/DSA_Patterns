package io.samcs.sorting;

public class MergeSort {
	public void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			// Sort first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	public void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temporary arrays
		System.arraycopy(arr, left, L, 0, n1);
		System.arraycopy(arr, mid + 1, R, 0, n2);

		// Merge the temporary arrays back into arr[left..right]
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy the remaining elements of L[], if there are any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy the remaining elements of R[], if there are any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

//	public void merge(int[] arr, int left, int mid, int right) {
//		int leftSize = mid - left+1;
//		int rightSize = right - mid;
//
//		int i=0, j=0, k=left;
//		while(i < leftSize && j < rightSize) {
//			if(arr[i] < arr[j]) {
//				arr[k] = arr[i];
//			}
//		}
//	}
}
