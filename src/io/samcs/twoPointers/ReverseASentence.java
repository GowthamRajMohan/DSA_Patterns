package io.samcs.twoPointers;

public class ReverseASentence {

	public static String reverse(String sentence) {
		sentence = sentence.replaceAll("\\s+", " ");
		char[] sentenceArray = sentence.toCharArray();
		int length = sentenceArray.length;
		reverseString(sentenceArray, 0, sentenceArray.length-1);
		for (int start = 0, end = 0; end <= length; end++) {
			if (end == length || sentenceArray[end] == ' ') {
				reverseString(sentenceArray, start, end - 1);
				start = end + 1;
			}
		}
		return new String(sentenceArray);
	}

	public static void reverseString(char [] array, int start, int end) {
		while (start < end) {
			char temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
