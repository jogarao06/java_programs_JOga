package java_programming;

public class PerfectNumber1ToN {

	public static void main(String[] args) {

		int n = 1000;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}

	}

}
