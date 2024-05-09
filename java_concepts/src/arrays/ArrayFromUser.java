package arrays;

import java.util.Scanner;

public class ArrayFromUser {
	public static void main(String[] args) {
		int b[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		for (int i = 0; i < 10; i++) {

			b[i] = sc.nextInt();
		}
		System.out.println("Printing elements");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i]);
		}
	}
}
