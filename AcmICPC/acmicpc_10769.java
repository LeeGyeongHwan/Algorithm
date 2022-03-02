package acmIcpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ACMICPC
 * Number: 10769
 * Title: 행복한지 슬픈지
 * URL: https://www.acmicpc.net/problem/10769
 * Solved Date: 2022-03-02
 * Solved By Reamer 
*/

public class acmicpc_10769 {

	private static final String HAPPY = ":-)";
	private static final String SAD = ":-(";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		int len = text.length();

		int happyNum = 0;
		int sadNum = 0;

		for (int i = 0; i < len - 2; i++) {
			if (text.substring(i, i + 3).equals(HAPPY)) {
				happyNum++;
			} else if (text.substring(i, i + 3).equals(SAD)) {
				sadNum++;
			}
		}

		if (happyNum == 0 && sadNum == 0) {
			System.out.println("none");
		} else if(happyNum > sadNum) {
			System.out.println("happy");
		} else if(happyNum < sadNum) {
			System.out.println("sad");
		} else {
			System.out.println("unsure");
		}
	}
}
