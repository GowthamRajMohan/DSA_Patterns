package io.samcs.twoPointers;



public class SortColours {

	public static int[] sort(int[] colours) {
		int start = 0;
		int current = 0;
		int end = colours.length - 1;

		while (current <= end) {
			if (colours[current] == 0) {
				swap(colours, start, current);
				start++;
				current++;
			} else if (colours[current] == 1) {
				current++;
			} else {
				swap(colours, current, end);
				end--;
			}
		}
		return colours;
	}
	private static void swap(int[] colours, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = colours[i];
		colours[i] = colours[j];
		colours[j] = temp;
	}
}

