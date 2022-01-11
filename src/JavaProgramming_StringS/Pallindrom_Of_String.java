package JavaProgramming_StringS;

public class Pallindrom_Of_String {

	public static void main(String[] args) {

		String str = "TYSS";
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equals(rev))
			System.out.println(str + " Give String is a Pallindrom");
		else
			System.out.println(str + " Give String is Not a Pallindrom");

	}

}
