package Collection;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationForLegacyClasses {

	public static void main(String[] args) {
		//Enumeration only applicable for legacy classes Stack and vector
		//Create an empty vector  
		Vector v = new Vector();
		//Add element in the vector 
		v.add("Prisha");
		v.add(null);
		v.add(null);
		v.add("Prisha");
		v.add("Teena");
		System.out.println("my vector is->"+v);
		//Get the element in the enumeration  
		Enumeration e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println("\nenumeration 1 gives elements->\n"+e1.nextElement());
		}
		
		Stack stk = new Stack();
		stk.add("Nora");
		stk.add("Bare");
		stk.add(45);
		stk.add(25.369845);
		
		Enumeration e2 = stk.elements();
		while(e2.hasMoreElements())
		{
			System.out.println("\nenumeration 2->"+e2.nextElement());
		}
	

	}

}
