package java_programming;

public class Check_givenNum_is_primeNumber {
	/**
	 * A prime number is a number that has only two factors, that is, 1 and the
	 * number itself. For example, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
	 * 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97. are prime numbers
	 */

	public static void main(String[] args) {
		int n = 97;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime == true)
			System.out.println(n + "is a prime number");
		else
			System.out.println(n + "is not a prime number");
	}
}
