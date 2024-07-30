package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_ArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Seema");
		a1.add("Ram");
		a1.add("Swati");
		a1.add("Cat");
		System.out.println("a1 is->"+a1);
		//iterator is method of arraylist
		Iterator i1 = a1.iterator();// we can iterate through each of elements of a1
		while(i1.hasNext())//checks if elements are present
		{
			System.out.println(i1.next());
		}
		ArrayList a2 = new ArrayList();
		//a2.add(null);
		Iterator i2=a2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		

	}

}
