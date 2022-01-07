package java_programming;

public class PllindromGivenString {

	public static void main(String[] args) {
		String str = "mom";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equals(rev))
			System.out.println(rev+"  is a Pllindrom");
		else
			System.out.println(rev+" is Not Pllindrom");

	}

}
