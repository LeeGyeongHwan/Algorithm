package acmIcpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ACMICPC
 * Number: 23080
 * Title: 스키테일 암호
 * URL: https://www.acmicpc.net/problem/23080
 * Solved Date: 2022-02-25
 * Solved By Reamer 
*/

public class acmicpc_23080 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String secretText = br.readLine();

		for (int i = 0; i < secretText.length(); i+= N) {
			System.out.print(secretText.charAt(i));
		}

	}
}
