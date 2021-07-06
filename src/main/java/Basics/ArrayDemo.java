package Basics;

public class ArrayDemo {
public static void main(String... args) {
	int arr[]=new int[5];
	Student stu[]=new Student[1];
	stu[0]=new Student("Sujith",99);
	
	for(Student i:stu) {
		System.out.println(i.marks);
	}
}
}

class Student{
	
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	
	String name;
	int marks;
}
