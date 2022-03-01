package acmIcpc;

/**
 * ACMICPC
 * Number: 6679
 * Title: 싱기한 네자리 숫자
 * URL: https://www.acmicpc.net/problem/6679
 * Solved Date: 2022-03-01
 * Solved By Reamer 
*/

public class acmicpc_6679 {

	public static void main(String[] args) {

		for (int i = 1000; i < 10000; i++) {
			int num10 = totalSum(i, 10);
			int num12 = totalSum(i, 12);
			int num16 = totalSum(i, 16);

			if (num10 == num12 && num12 == num16)
				System.out.println(i);
		}
	}

	public static int totalSum(int A, int B) {
		int num = 0;
		while (A > 0) {
			num += A % B;
			A /= B;
		}
		return num;
	}
}
