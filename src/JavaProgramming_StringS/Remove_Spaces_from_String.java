package JavaProgramming_StringS;

public class Remove_Spaces_from_String {

	public static void main(String[] args) {
		String str = "shyamsinga Roy";
		
		char[] strarray=str.toCharArray();
		StringBuffer stringbuff=new StringBuffer();
		for (int i = 0; i < strarray.length; i++) {
			if ((strarray[i] !=' ') && (strarray[i]!='\t')) { 
				stringbuff.append(strarray[i]);
			}
			
		}
		String noSpaceStr2=stringbuff.toString();
		System.out.println(noSpaceStr2);

	}

}
