import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ACMICPC
 * Number: 21567
 * Title: 숫자의 개수 2
 * URL: https://www.acmicpc.net/problem/21567
 * Solved Date: 2022-02-22
 * Solved By Reamer 
*/

public class acmicpc_21567 {
	
	private static int[] numArr = new int[10];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long A = Long.parseLong(br.readLine());
		long B = Long.parseLong(br.readLine());
		long C = Long.parseLong(br.readLine());
		long mul = A * B * C;

		while (mul > 0) {
			int index = (int) (mul % 10);
			numArr[index]++;
			mul /= 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(numArr[i]);
		}
	}
	
}
