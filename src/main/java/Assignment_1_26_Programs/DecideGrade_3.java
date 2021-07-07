package Assignment_1_26_Programs;

import java.util.Scanner;

public class DecideGrade_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	if(marks>80) {
		System.out.println("O Grade");
	}else if(marks>50) {
		System.out.println("A+ Grade");
	}else {
		System.out.println("A Grade");
	}
}
}
