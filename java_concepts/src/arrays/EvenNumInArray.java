package arrays;

public class EvenNumInArray {
	public static void main(String[] args) {
		int arr[] = { 10, 21, 33, 43, 50, 61, 66 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
//				System.out.println("Even Numbers are ");
				System.out.println(arr[i]);
			}
//				else {
//				System.out.println("Odd numbers are ");
//				System.out.println(arr[i]);
//			}

		}
	}
}