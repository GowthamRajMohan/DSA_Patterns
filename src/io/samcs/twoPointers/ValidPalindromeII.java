package io.samcs.twoPointers;

public class ValidPalindromeII {
	public static boolean isValidPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		int mismatchCount = 0;

		while (left < right) {
			if (mismatchCount > 1) {
				return false;
			}
			if (s.charAt(left) == s.charAt(right)){
				left++;
				right--;
			} else  {
				right--;
				mismatchCount++;
			}
		}

		return true;
	}
}
