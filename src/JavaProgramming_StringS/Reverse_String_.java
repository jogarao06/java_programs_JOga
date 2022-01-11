package JavaProgramming_StringS;

public class Reverse_String_
{

	public static void main(String[] args) 
	{
		String str = "Rama Rao";
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		   System.out.println(rev);
	}

}
