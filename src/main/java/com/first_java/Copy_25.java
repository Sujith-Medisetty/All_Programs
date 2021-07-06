package com.first_java;

public class Copy_25 {
public static void main(String[] args) {
	int a[]= {1,2,33};
	int b[]=new int[3];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	
	for(int i:b) {
		System.out.println(i);
	}
}
}
