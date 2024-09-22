package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProg {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(25);
		v1.add(55);
		v1.add(80);
		System.out.println(v1);
		
		Enumeration e1 = v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
