package Java_Programming_Arrys;

import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {
		int[] array = new int[] { 90, 80, 70, 50, 20 };
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);

		}

	}

}
