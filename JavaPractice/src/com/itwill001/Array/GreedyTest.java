package com.itwill001.Array;

import java.util.Iterator;

public class GreedyTest {

	public static void main(String[] args) {

		int[] coins = { 500, 100, 50, 10 }; //
		int price = 8370;
		int count = 0;
		for (int i = 0; i < coins.length; i++) {

			count = price / coins[i];

			price = price % coins[i];

			System.out.printf("%d짜리 동전 %d개가 필요합니다\n", coins[i], count);
		}

	}

}