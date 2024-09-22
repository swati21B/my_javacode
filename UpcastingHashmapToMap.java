package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class UpcastingHashmapToMap {
//Upcasting HashmapTo Map to use methods of Map interface
	// Initializing a Map of type HashMap 
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Ram", 25);
		m1.put("Smita", 35);
		m1.put("Neha", 40);
		System.out.println(m1);
		m1.clear();
		System.out.println(m1);
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Prisha", 2);
		m2.put("Ram", 90);//for key ram storing age as 90
		m2.putAll(m1);
		System.out.println(m1);
		m1.putIfAbsent("Naina", 63);
		System.out.println(m1);
		System.out.println(m1.containsKey("Sasha"));
		System.out.println(m1.containsValue(63));
		
		Map<String, Integer> m3 = new HashMap<String, Integer>();
		m3.put("Prisha", 2);
		m3.put("Naina", 63);
		m3.put("Ram", 90);
		
		System.out.println(m1.equals(m3));
		System.out.println(m3.remove("Ram"));
		System.out.println(m3.remove("Naina", 63));
		m2.replace("Prisha", 12);
		System.out.println(m3);
		//System.out.println(m1.replaceAll());
		m3.put("Radha", 5);
		m3.put("Rani", 15);
		System.out.println(m3.keySet());//gives o/p in the form of collection as return type is set
		System.out.println(m3.values());
		System.out.println(m3.entrySet());

	}

}
