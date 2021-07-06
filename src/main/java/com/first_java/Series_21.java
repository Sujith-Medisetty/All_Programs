package com.first_java;

public class Series_21 {
public static void main(String[] args) {
	int n = 4;
	for (int j = 1; j <= n; j++) {

		for (int i = 0; i < n - j; i++) {
			System.out.print("  ");
		}

		int temp = j;
		while (temp > 1) {
			System.out.print(temp + " ");
			temp = temp - 1;
		}
		while (temp <= j) {
			System.out.print(temp + " ");
			temp++;
		}

		System.out.println();
	}
	
	for(int k=1;k<=n-1;k++) {
		for(int i=0;i<k;i++) {
			System.out.print("  ");
		}
		
		int temp=n-k;
		while(temp>1) {
			System.out.print(temp+" ");
			temp--;
		}
		while(temp<=(n-k)) {
			System.out.print(temp+" ");
			temp++;
		}
		
		System.out.println();
	}
}
}
