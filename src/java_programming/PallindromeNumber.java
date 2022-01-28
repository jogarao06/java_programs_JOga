package java_programming;

public class PallindromeNumber {

	public static void main(String[] args) {
		{
			int num=121;
			int temp=num;
			int sum=0;
			while(num>0) {
				int rem=num%10;
				num=num/10;
				sum=(sum*10)+rem;
			}
			if (sum == temp)
				System.out.println(temp + " these number is Pallindrome number");
			else
				System.out.println(temp + " these  number is not Pallindrome number");

		}
	}
}