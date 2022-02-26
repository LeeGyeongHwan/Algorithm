package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * Number: 9
 * Title: Palindrome Number
 * URL: https://leetcode.com/problems/palindrome-number/
 * Solved Date: 2022-02-26
 * Solved By Reamer 
*/

public class leetcode_9 {
	public static void main(String[] args){
		int x = 3;
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		List<Integer> list = new ArrayList<>();
		if (x < 0)
			return false;
		while (x != 0) {
			list.add(x % 10);
			x /= 10;
		}
		int size = list.size();
		for (int i = 0; i < size / 2; i++) {
			if (list.get(i) != list.get(size - i - 1))
				return false;
		}
		return true;
	}
}