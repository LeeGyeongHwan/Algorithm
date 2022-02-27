package acmIcpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * ACMICPC
 * Number: 15720
 * Title: 카우버거
 * URL: https://www.acmicpc.net/problem/15720
 * Solved Date: 2022-02-27
 * Solved By Reamer 
*/

public class acmicpc_15720 {
	
	private static List<Integer> burgerList = new ArrayList<>();
	private static List<Integer> sideList = new ArrayList<>();
	private static List<Integer> drinkList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int tmp;
		int totalPrice = 0;

		st = new StringTokenizer(br.readLine());
		int burger = Integer.parseInt(st.nextToken());
		int side = Integer.parseInt(st.nextToken());
		int drink = Integer.parseInt(st.nextToken());
		
		int minSet = Integer.min(Integer.min(burger, side), drink);

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < burger; i++) {
			tmp = Integer.parseInt(st.nextToken());
			burgerList.add(tmp);
			totalPrice += tmp;
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < side; i++) {
			tmp = Integer.parseInt(st.nextToken());
			sideList.add(tmp);
			totalPrice += tmp;
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < drink; i++) {
			tmp = Integer.parseInt(st.nextToken());
			drinkList.add(tmp);
			totalPrice += tmp;
		}

		Collections.sort(burgerList, Collections.reverseOrder());
		Collections.sort(sideList, Collections.reverseOrder());
		Collections.sort(drinkList, Collections.reverseOrder());

		int setPrice = totalPrice;

		for (int i = 0; i < minSet; i++) {
			setPrice -= burgerList.get(i) / 10;
			setPrice -= sideList.get(i) / 10;
			setPrice -= drinkList.get(i) / 10;
		}

		System.out.println(totalPrice);
		System.out.println(setPrice);
	}
	
}
