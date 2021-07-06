package Basics;

interface Rules{
	void disp();
}

public class InterfaceDemo implements Rules {

	
public static void main(String[] args) {
InterfaceDemo obj=new InterfaceDemo();
obj.disp();

}

public void disp() {
System.out.println("overidden");
}
}


