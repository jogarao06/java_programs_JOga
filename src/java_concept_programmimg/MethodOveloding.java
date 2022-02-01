package java_concept_programmimg;

public class MethodOveloding

{
	public static void main(String[] args) {

		add();
		add(100, 200);
		add('A', 'B');
		add(100, "java");
		add("SQL", 200);

	}

	private static void add(String s, int i) 
	{
		System.out.println(s + i);
	}

	private static void add(int i, String s) 
	{
		System.out.println(i + s);
	}

	private static void add(int i, int j) 
	{
		System.out.println(i + j);
	}

	private static void add() 
	{
       System.out.println(10 + 20);
       
	}

}
