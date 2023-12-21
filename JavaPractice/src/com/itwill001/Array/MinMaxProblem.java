package com.itwill001.Array;

import java.util.Iterator;

public class MinMaxProblem {

	public static void main(String[] args) {

		int[] numbers = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };

		int min = numbers[0];
		int max = numbers[0];
		int minPos = 0;
		int maxPos = 0;

		for (int i = 0; i < numbers.length - 1; i++) {

				if (numbers[i] < numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;}
				
				else {
					min = numbers[i+1];
					minPos = i+1;
				}
				

		}

		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");
	}

}