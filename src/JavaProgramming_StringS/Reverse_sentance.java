package JavaProgramming_StringS;

public class Reverse_sentance {

	public static void main(String[] args) {
		String[] s = "you shall not pass".split(" ");
		String revsent = "";
		for (int i = s.length - 1; i >= 0; i--) {
			revsent = revsent+s[i] + " ";
		}
		System.out.println("Reversed String: " + revsent);
	}

}
