package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorprogr {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Swati");
		a1.add("Teena");
		a1.add("Prisha");
		
		System.out.println(a1);
		
		ListIterator l1 = a1.listIterator();
		
	
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		

	}

}
