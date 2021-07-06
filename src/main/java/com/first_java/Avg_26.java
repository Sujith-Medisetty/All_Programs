package com.first_java;

public class Avg_26 {

	public static void main(String[] args) {
		System.out.println(Average(1, 2, 3));
	}

	public static int Average(int... arr) {
		int sum = 0;

		for (int i : arr) {
			sum = sum + i;
		}

		return sum;
	}

}
