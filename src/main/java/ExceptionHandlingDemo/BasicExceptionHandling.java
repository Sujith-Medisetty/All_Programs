package ExceptionHandlingDemo;

import java.io.IOException;

public class BasicExceptionHandling {
public static void main(String[] args) {
	try {
		int var1=10,var2=0;
		int output=var1/var2;
		
		int arr[]= {1,2,3};
		for(int h=0;h<12;h++) {
			System.out.println(arr[h]);
		}
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
