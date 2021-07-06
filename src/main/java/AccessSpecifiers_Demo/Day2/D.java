package AccessSpecifiers_Demo.Day2;

import AccessSpecifiers_Demo.Day1.A;

public class D extends A{
public void display() {
	System.out.println(pub);
	System.out.println(pro);
	
	add();
	mul();
}

public static void main(String[] args) {
	D obj=new D();
	obj.display();
}
}
