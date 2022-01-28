package java_programming;


public class alternat_uperand_lowecase {

	public static void main(String[] args) {
		
		String str = "jogga";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			ch[i] = Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}
}
