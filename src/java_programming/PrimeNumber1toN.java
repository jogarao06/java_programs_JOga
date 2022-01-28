package java_programming;

public class PrimeNumber1toN {
	/**
	 * description: a number that is divisible only by itself and 1 (e.g. 2, 3, 5,7,
	 * 11,13).
	 */
	public static void main(String[] args) {
		int n = 10;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}
