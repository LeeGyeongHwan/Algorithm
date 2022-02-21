import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ACMICPC
 * Number: 10103
 * Title: 주사위 게임
 * URL: https://www.acmicpc.net/problem/10103
 * Solved Date: 2022-02-21
 * Solved By Reamer 
*/

public class acmicpc_10103 {
	
	private static int scoreA = 100;
	private static int scoreB = 100;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int diceA = Integer.parseInt(st.nextToken());
			int diceB = Integer.parseInt(st.nextToken());
			
			if (diceA > diceB) {
				scoreB -= diceA;
			} else if(diceA < diceB) {
				scoreA -= diceB;
			}							
		}
		System.out.println(scoreA);
		System.out.println(scoreB);		
	}
	
}
