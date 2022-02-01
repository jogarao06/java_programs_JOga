package java_concept_programmimg;

public class Constructorconcept {

	static String car;
	static int cc;

	private  Constructorconcept() {
		this.car = "BMW";
		this.cc = 500;
		//System.out.println(this.car);
		//System.out.println(this.cc);
	}

	public static void main(String[] args) {
		Constructorconcept con=new Constructorconcept();
     	System.out.println(con.car);
		System.out.println(con.cc);
		System.out.println(Constructorconcept.car);
		System.out.println(Constructorconcept.cc);
	}
}
