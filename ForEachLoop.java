package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachLoop {

	public static void main(String[] args) {
		Map<String, Float> m1 = new HashMap<String, Float>();
		m1.put("Ram", 25.36f);
		m1.put("Smita", 35.63f);
		m1.put("Neha", 40.33f);
		System.out.println(m1);
		//for each loop
		System.out.println("fetch keys together");
		for(String ab : m1.keySet())
		{
			System.out.println(ab);
		}
		System.out.println("fetch values together");
		for(Float f1 : m1.values())
		{
			System.out.println(f1);
		}
		System.out.println("fetch key and values together");
		for(Entry<String, Float> s1 : m1.entrySet())
		{
			System.out.println(s1);
		}
		Map<Integer, String> monthsInAYear = new HashMap<Integer, String>();

		// store business days i-e; key/value pairs in the Map
		monthsInAYear.put(1, "January");
		monthsInAYear.put(2, "February");
		monthsInAYear.put(3, "March");
		monthsInAYear.put(4, "April");
		monthsInAYear.put(5, "May");
		monthsInAYear.put(6, "June");
		monthsInAYear.put(7, "July");
		monthsInAYear.put(8, "August");
		monthsInAYear.put(9, "September");
		monthsInAYear.put(10, "October");
		monthsInAYear.put(11, "November");
		monthsInAYear.put(12, "December");
		// iterate map / traverse the map using using iterator
		Iterator<Entry<Integer, String>> i1 = monthsInAYear.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}


	}

}
