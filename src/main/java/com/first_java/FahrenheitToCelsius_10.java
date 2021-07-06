package com.first_java;

import java.util.Scanner;

public class FahrenheitToCelsius_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int f=sc.nextInt();
	int c=(5*(f-32))/9;
	System.out.println(c);
}
}
