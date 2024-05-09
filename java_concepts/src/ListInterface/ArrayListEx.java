package ListInterface;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("Printing elements in reverse order");
		for (int i = al.size() - 1; i >= 0; i--) {
			System.out.println(al.get(i));
		}
	}
}
