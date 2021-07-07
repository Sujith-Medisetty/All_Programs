package Assignment_1_26_Programs;

public class Fibonacci_4 {
public static void main(String[] args) {
	int a=1;
	int b=1;
	int c,i=3;
	System.out.print(a+" "+b+" ");
	while(i<20) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		i++;
	}
}
}
