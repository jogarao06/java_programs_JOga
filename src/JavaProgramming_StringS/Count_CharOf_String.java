package JavaProgramming_StringS;

public class Count_CharOf_String {

	public static void main(String[] args) {
		String string = "JogaRao";
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') // for spaces
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);
		}
}
