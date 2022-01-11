package JavaProgramming_StringS;

public class rev_word_in_sentance_String {

	public static void main(String[] args) {
		String str="My name is joga";
		String words[]=str.split(" ");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord=reverseWord+sb.toString()+" ";  
	    }  
	    System.out.println(reverseWord.trim());  
	}

}
