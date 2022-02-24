package acmIcpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ACMICPC
 * Number: 20499
 * Title: Darius님 한타 안 함?
 * URL: https://www.acmicpc.net/problem/20499
 * Solved Date: 2022-02-24
 * Solved By Reamer 
*/

public class acmicpc_20499 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] KDA = str.split("/");

		int K = Integer.parseInt(KDA[0]);
		int D = Integer.parseInt(KDA[1]);
		int A = Integer.parseInt(KDA[2]);

		if (K + A < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}
