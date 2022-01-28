package Java_Programming_Arrys;

import java.util.Arrays;

public class insert_element_into_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int newArr[] = new int[n + 1];
		int value = 7;
		for (int i = 0; i < n; i++) {
			newArr[i] = arr[i];
		}
		newArr[n] = value;
		System.out.println(Arrays.toString(newArr));
	}
}
