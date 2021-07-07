package Assignment_1_26_Programs;

public class Avg_7 {
public static void main(String[] args) {
	int arr[]= {12,23,45,87,65,478};
	int sum=0;
	for(int i:arr) {
		sum=sum+i;
	}
	
	System.out.println(sum/arr.length);
}
}
