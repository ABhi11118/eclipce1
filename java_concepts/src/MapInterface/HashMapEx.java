package MapInterface;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Object, String> hm = new HashMap<>();
		hm.put("F name", "Virat");
		hm.put("Team", "India");
		hm.put("Jerssy no", "18");
		hm.put("Role", "One Down Batsman");
		System.out.println(hm.entrySet()); //Print all entries in Map
		System.out.println(hm.containsValue("18")); //Print true if value is present else false will be printed
		System.out.println(hm.containsKey("Team")); //Print true if value is present else false will be printed
		System.out.println(hm.get("Team")); //used to access the associated value
	}
}
