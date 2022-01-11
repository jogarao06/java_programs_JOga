package JavaProgramming_StringS;

public class NumOf_lower_ujpper_sym_in_str {

	public static void main(String[] args) {
		String str = "Joga123123@gmail.com";
		int upper = 0, lower = 0, num = 0, Special = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				num++;
			} else {
				Special++;
			}
		}
		System.out.println("lowercase letters: " + lower);
		System.out.println("uppercase letters: " + upper);
		System.out.println("Number: " + num);
		System.out.println("Special characters: " + Special);
	}

}
