package Basics;

public class VarargsDemo {
public static void main(String[] args) {
	Display.display(23,65,78);
}
}

class Display{
	public static void display(int... args) {
		for(int i:args) {
			System.out.println(i);
		}
	}
}
