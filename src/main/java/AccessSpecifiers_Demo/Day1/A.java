package AccessSpecifiers_Demo.Day1;

public class A {
public int pub=14;
private int pri=12;
protected int pro=10;
int def=0;

public void add() {
	System.out.println("Add");
}
private void sub() {
	System.out.println("Sub");
}
protected void mul() {
	System.out.println("Mul");
}
void div() {
	System.out.println("div");
}
}
