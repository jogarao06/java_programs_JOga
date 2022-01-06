package java_programming;

public class Happy_or_Not_Number_ {
	/**
	 * The first few happy numbers are 
	 * 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100, 
	 * 
	 */

	public static int isHappyNumber(int num) {
		int rem = 0, sum = 0;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 82;
		int result = num;

		while (result != 1 && result != 4) {
			result = isHappyNumber(result);
		}

		if (result == 1)
			System.out.println(num + " is a happy number");
		else if (result == 4)
			System.out.println(num + " is not a happy number");
	}
}
