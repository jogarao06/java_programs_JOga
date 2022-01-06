package java_programming;

public class NumIS_Strong_or_Not_given {
	/**
	 * description:1!+4!+5!=145
	 * 
	 */

	public static void main(String[] args) {
		int n = 145;
		int fact, rem;
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int i = 1;
			fact = 1;
			rem = n % 10;

			while (i <= rem) {
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
			n = n / 10;
		}

		if (sum == temp)
			System.out.println(temp + " is a strong number");
		else
			System.out.println(temp + " is not a strong number");

	}

}
