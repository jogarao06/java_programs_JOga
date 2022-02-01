package JavaProgramming_StringS;

public class Remove_duplicate_charters_In_String {

	public static void main(String[] args) {
		String s = "java";
		String s1 = " ";

		for (int i = 0; i < s1.length(); i++) {
			char ch = s.charAt(i);
			if (s1.indexOf(ch) == -1) {
				s1 = s1 + ch;

			}

		}
		System.out.println(s1);

	}

}
