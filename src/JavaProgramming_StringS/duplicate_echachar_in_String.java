package JavaProgramming_StringS;

public class duplicate_echachar_in_String {

	public static void main(String[] args) {

		String s = "good noon madam";
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] == s1[j] && s1[i] != ' ') {
					count++;
					s1[j] = '0';
				}
			}
			if (count > 1 && s1[i] != '0')
				System.out.println(s1[i]);
		}
	}
}
