package java_programming;

public class Happy_or_Not_Number_ {
	/**
	 * The first few happy numbers are 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68,
	 * 70, 79, 82, 86, 91, 94, 97, 100, 
	 */
	public static void main(String[] args) {
		int num = 2, rem, sum = 0;
		int result = num;

		while (num > 9) {
			while (num > 0) {
				rem = num % 10;
				num = num / 10;
				sum = sum + (rem * rem);

			}
			num = sum;
			sum = 0;

		}
		if (num == 1)
			System.out.println(result + " is a happy number");
		else
			System.out.println(result + " is not a happy number");
	}
}
