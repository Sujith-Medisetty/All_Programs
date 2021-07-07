package Assignment_1_26_Programs;

import java.util.Scanner;

public class CompoundInterest_17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt();
	int r=sc.nextInt();
	int n=sc.nextInt();
	int t=sc.nextInt();
	double a=(p*(1+Math.pow((r/n), n*t)));
	System.out.println(a);
}
}
