package JavaProgramming_StringS;

public class Low2Uper_visv_string {

	public static void main(String[] args) {

		String str = "JOGA";
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			ch[i] = Character.toUpperCase(ch[i]);
		}
		System.out.println(ch);
	}

//	StringBuffer sb = new StringBuffer(str1);
//
//	for (int i = 0; i < str1.length(); i++) {
//
//		if (Character.isLowerCase(str1.charAt(i))) {
//			sb.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
//
//		} else
//	       if (Character.isUpperCase(str1.charAt(i))) {
//			sb.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
//		}
//	}
//	System.out.print(sb);
//}

}
