package Assignment_1_26_Programs;

public class OddSum_14 {
public static void main(String[] args) {
	int sum=0;
	for(int i=2;i<=100;i++) {
		if(i%2!=0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
