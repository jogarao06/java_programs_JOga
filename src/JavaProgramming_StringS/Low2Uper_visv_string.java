package JavaProgramming_StringS;

public class Low2Uper_visv_string {

	public static void main(String[] args) {

		String str1 = "g jOGA rAO";
//		StringBuffer sb = new StringBuffer(str1);
//
//		for (int i = 0; i < str1.length(); i++) {
//
//			if (Character.isLowerCase(str1.charAt(i))) {
//				sb.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
//
//			} else if (Character.isUpperCase(str1.charAt(i))) {
//				sb.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
//			}
//		}
//		System.out.print("String after case conversion : " + sb);
//	}
		 str1 = str1.toLowerCase();
	      char[] ch = str1.toCharArray();
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println(new String(ch));
	   }
}
