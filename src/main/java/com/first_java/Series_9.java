package com.first_java;

public class Series_9 {
public static void main(String[] args) {
	int n=7;
	
	for(int i=1;i<=n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print((j*i)+" ");
		}
		System.out.println();
	}
}
}
