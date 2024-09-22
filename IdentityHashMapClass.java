package mapInterface;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapClass {

	public static void main(String[] args) {
		//Creating the instance of IdentityHashmap   
		Map<String, String> Ih1 = new IdentityHashMap<String, String>();
		Ih1.put("Priya", "Engineer");
		Ih1.put("Amruta", "Doctor");
		Ih1.put("Ashu", "CA");
		Ih1.put("Teena", "SEO");
		Ih1.put("Meena", "Manager");
		System.out.println("my IdentityHashMap is->"+Ih1);
		System.out.println("Size of IdentityHashMap->"+Ih1.size());
		//collection view
		System.out.println("\ncollection view for values->\n"+Ih1.values());
		// Declaring a set of the entries  
	    	//Set set = Ih1.entrySet();  
		 // Iterator i1= set.iterator();
	      //Declaring an iterator  
	    	Iterator<IdentityHashMap.Entry<String, String> >  
	        itr = Ih1.entrySet().iterator();
	    
	      while(itr.hasNext())
	      {
	    	  System.out.println("\nDisplaying the elements->\n"+itr.next());
	      }
	      
	      System.out.println("\nCollection view for keys->\n"+Ih1.keySet());
	    
	      //Creating the instance of LinkedHashmap 
		LinkedHashMap<String, String> LinkedMap = new LinkedHashMap<String, String>();
		LinkedMap.put("1990", "Prasad");
		LinkedMap.put("1994", "Swati");
		//creating a new Identityhash map and copying using putAll() 
		LinkedMap.putAll(Ih1);
		System.out.println("\nLinkedHashMap together with IdentityHashMap\n"+LinkedMap);
		 // inserting existing key along with new value  
		String oldValue = (String) LinkedMap.put("1990", "Isha");
		// verifying the old returned value  
		System.out.println("\nReturned old value is->\n"+oldValue);
		// displaying the new map  
		System.out.println("\nLinkedHashMap after changing the value->\n"+LinkedMap);
		//remove key
		LinkedMap.remove("1994");
		System.out.println("\nKey removed from LinkedHashMap->\n"+LinkedMap);
		System.out.println("\ndisplaying value of key Priya->\n"+LinkedMap.get("Priya"));
	// getting the set view of keys using keySet()  
	System.out.println("\nSet view of keys:->\n"+LinkedMap.keySet());  
	 // getting the set view for key values using entrySet()  
    System.out.println("\nThe set view of key values ->:\n"  
            + LinkedMap.entrySet()); 
  

	}

}
