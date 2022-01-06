package java_programming;

public class Check_givenNum_is_primeNumber {

	public static void main(String[] args) {
		int n = 9;
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
