package leetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * Number: 13
 * Title: Roman to Integer
 * URL: https://leetcode.com/problems/roman-to-integer/
 * Solved Date: 2022-02-23
 * Solved By Reamer 
*/

public class leetcode_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(Solution.romanToInt(str));
	}
}

class Solution {

	private static Map<String,Integer> map = new HashMap<String, Integer>(){{
		put("I", 1);	put("IV", 4);
		put("V", 5);	put("IX", 9);
		put("X", 10);	put("XL", 40);
		put("L", 50);	put("XC", 90);
		put("C", 100);	put("CD", 400);
		put("D", 500);	put("CM", 900);
		put("M", 1000);
	}};

	public static int romanToInt(String s) {
		int result = 0;

		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				String subStr = s.substring(i, i + 2);
				if(map.containsKey(subStr)) {
					result += map.get(subStr);
					i++;
					continue;
				}
			}
			result += map.get(s.substring(i, i + 1));
		}
		return result;
	}
}