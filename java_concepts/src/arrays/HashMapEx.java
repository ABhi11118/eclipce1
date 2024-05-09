package arrays;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Object, String> hm = new HashMap<>();
		hm.put("F name", "Virat");
		hm.put("L name", "Kohli");
		hm.put("Country", "India");
		System.out.println(hm.entrySet());
	}
}
