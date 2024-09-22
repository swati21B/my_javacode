package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class DifferenceofListandSet {

	public static void main(String[] args) {
		//upcasting
	List l1=	new ArrayList();
	System.out.println("Understanding List interface");
	l1.add("Ram");
	l1.add("Sita");
	l1.add("Laxman");
	l1.add(null);
	l1.add('I');
	l1.add(null);
	l1.add("Sita");
	System.out.println(l1);
	//using iterator concept doing forward iteration
	System.out.println("iterator for forward iteration");
	Iterator i1=l1.iterator();
	while(i1.hasNext())
			{
		System.out.println(i1.next());
			}
	//using ListIterator for forward and backward iteration
	System.out.println("ListIterator forward and backward iteration");
	ListIterator ls1=l1.listIterator();
	//forward iteration
	while(ls1.hasNext())
	{
		System.out.println(ls1.next());
	}
	//backward iteration
	while(ls1.hasPrevious())
	{
		System.out.println(ls1.previous());
	}	
	
	//difference of List & Set
	//upcasting HashSet to Set
	Set s1 =new HashSet();
	System.out.println("Understanding Set interface");
	s1.add("Ram");
	s1.add("Sita");
	s1.add("Laxman");
	s1.add(null);
	s1.add('I');
	s1.add(null);
	s1.add("Sita");
	System.out.println(s1);
	//using iterator concept doing forward iteration 
	//as iterator applicable to List/Set/Queue interfaces
		System.out.println("iterator for forward iteration in Set interface");
		Iterator i2=s1.iterator();
		while(i2.hasNext())
				{
			System.out.println(i2.next());
				}
}

}
