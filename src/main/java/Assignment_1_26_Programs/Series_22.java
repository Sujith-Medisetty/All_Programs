package Assignment_1_26_Programs;

public class Series_22 {
	public static void main(String[] args) {
		int n = 4;
		for (int j = 1; j <= n; j++) {

			for (int i = 0; i < n - j; i++) {
				System.out.print("  ");
			}

			int temp = j;
			while (temp > 1) {
				System.out.print(temp + " ");
				temp = temp - 1;
			}
			while (temp <= j) {
				System.out.print(temp + " ");
				temp++;
			}

			System.out.println();
		}

	}
}
