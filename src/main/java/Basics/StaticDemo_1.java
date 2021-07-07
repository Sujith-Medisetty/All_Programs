package Basics;

public class StaticDemo_1 {

	public static void main(String[] args) {
		StaticDemo_1.disp();
		Ok1.disp2();
	}

	static void disp() {
		System.out.println("hey buddy...");
	}
}

class Ok1{
	static void disp2() {
		System.out.println("hey buddy...");
	}
	
}