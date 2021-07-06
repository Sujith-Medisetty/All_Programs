package AccessSpecifiers_Demo.Day1;

public class C extends A {
	public void method1() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		
		add();
		mul();
		div();
	}
	
	public void add() {
		
	}
	
	public static void main(String[] args) {
		 C obj=new C();
		obj.method1();
	}
}
