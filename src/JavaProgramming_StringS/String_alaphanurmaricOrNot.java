package JavaProgramming_StringS;

public class String_alaphanurmaricOrNot {

	public static void main(String[] args) {
		String str="joga1212";
		boolean flag=false;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=47 && ch<=58) {
				flag=true;
				break;	
			}
		}
		System.out.println(flag);
	}
}
