
package java_programming;

public class Armstrong_number {
	/**
	 * Description:Armstrong number is a number 
	 * that is equal to the sum of cubes of its digits.
	 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
	 */
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		while (num > 0)
		{
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp)
			System.out.println(sum +" is a Armstrong_number");
		else
			System.out.println(sum +" is not a Armstrong_number");

	}
}
