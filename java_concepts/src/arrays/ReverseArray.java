package arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
