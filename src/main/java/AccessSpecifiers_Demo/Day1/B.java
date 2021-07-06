package AccessSpecifiers_Demo.Day1;

public class B {
public static void main(String[] args) {
	A obj=new A();
	System.out.println(obj.pub);
	System.out.println(obj.pro);
	System.out.println(obj.def);
	
	obj.add();
	obj.mul();
	obj.div();
}
}
