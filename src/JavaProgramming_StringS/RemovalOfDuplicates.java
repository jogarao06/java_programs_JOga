package JavaProgramming_StringS;

public class RemovalOfDuplicates {
	public static void main(String[] args) {
		String s = "india is my country";
		String str = " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (str.indexOf(ch) == -1) {
				str = str + ch;
			}
		}
		System.out.print(str);
	}
}
