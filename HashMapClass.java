package mapInterface;

import java.util.Collection;
import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		// Initializing a  HashMap 
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Monday");
		h1.put(2, "Tuesday");
		h1.put(3, "Wednesday");
		h1.put(4, "Thursday");
		h1.put(5, "Friday");
		
		System.out.println("Hashmap h1 is->"+h1);
		HashMap<Integer, String> WE1 = new HashMap<Integer, String>();
		WE1.put(6, "Saturday");
		WE1.putAll(h1);
		System.out.println("Hashmap WE1 inserted in h1 hashmap->" +WE1);
		WE1.putIfAbsent(7, "Sunday");
		System.out.println("if key value does not exist ->"+WE1);
		WE1.remove(6);
		System.out.println("removed key 6->"+WE1);
		WE1.remove(3, "Wednesday");
		System.out.println("removed value Wednesday->"+WE1);
		System.out.println("equals, contains returns boolean->");
		System.out.println(h1.containsKey(1));
		System.out.println(h1.containsValue("onlyday"));
		System.out.println(WE1.equals(h1));
		//Returns a Set view of the mappings contained in this map 
		System.out.println(h1.entrySet());
		//collection view
		System.out.println("Collection view is->"+h1.values());
		//values method has collection return type
		
		h1.clear();
		System.out.println("hashmap h1 cleraed->"+h1);
		
		
		
		

	}

}
