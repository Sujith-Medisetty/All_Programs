package Basics;

public class ObjectCount {
public static void main(String[] args) {
	Count obj1=new Count();
	Count obj2=new Count();
	Count obj3=new Count();
	
	System.out.println(obj1.count);
}
}

class Count{
	int count=0;
	Count(){
		count++;
	}
}
