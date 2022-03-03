package acmIcpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ACMICPC
 * Number: 2774
 * Title: 아름다운 수
 * URL: https://www.acmicpc.net/problem/2774
 * Solved Date: 2022-03-03
 * Solved By Reamer 
*/

public class acmicpc_2774 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int X = Integer.parseInt(br.readLine());
			int cnt[] = new int[10];

			while (X > 0) {
				cnt[X % 10] ++;
				X /= 10;
			}
			
			int sum = 0;
			for (int j = 0; j < 10; j++) {
				if (cnt[j] != 0)
					sum++;
			}
			System.out.println(sum);
		}
	}

	
}
