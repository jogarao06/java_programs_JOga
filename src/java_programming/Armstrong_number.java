package java_programming;

public class Armstrong_number {
	/**
	 * Description: Check the given number is prime number or not  
	 * 
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
