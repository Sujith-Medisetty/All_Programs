package Basics;

public class ObjectCount {
public static void main(String[] args) {
	Count obj1=new Count();
	Count obj2=new Count();
	
	System.out.println(obj1.count);
}
}

class Count{
	static int count=0;
	Count(){
		count++;
	}
}
