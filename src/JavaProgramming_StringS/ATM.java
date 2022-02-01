package JavaProgramming_StringS;

public class ATM {

	public static void main(String[] args) {
		String str = "Good After Noon";
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i].charAt(0));
		}

	}
}
