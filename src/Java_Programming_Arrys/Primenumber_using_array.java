package Java_Programming_Arrys;

public class Primenumber_using_array {

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 9, 8 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= 10; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[i]);
			}
		}
	}

}
