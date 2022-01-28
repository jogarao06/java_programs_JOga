package Java_Programming_Arrys;

public class rev_elementIn_array {

	public static void main(String[] args) {
		int[] arr ={2, 4, 5, 9};
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + "");
		}
	}

}
