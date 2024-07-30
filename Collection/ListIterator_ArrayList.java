package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_ArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Seema");
		a1.add("Ram");
		a1.add("Swati");
		a1.add("Cat");
		a1.add('B');
		System.out.println("a1 is->"+a1);
		
		ListIterator l1 =a1.listIterator();
		while(l1.hasNext())//forward iteration
		{
			System.out.println("forward iteration->"+l1.next());
		}
		while(l1.hasPrevious())//backward iteration
		{
			System.out.println("backward iteration->"+l1.previous());
		}
		

	}

}
