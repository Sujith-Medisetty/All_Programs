package Basics;

public class Variables {
	
	//global variables  and by default global variables will get zero as there default value.
	int k = 100; // instance variable
	static int kj = 234; // class variable

	public static void main(String[] args) {
		int i = 4; // local variable
		
		// what is an object? instance of class.
		Variables obj=new Variables();
		System.out.println("k value is "+obj.k);
		System.out.println("static value is "+kj);

		int a=100;
		long b=a; // implicit type casting
		
		long a1=100L;
		int b1=(int)a1;  //explicit type casting
		
	}
}
