package Assignments;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Assignment54_StackMethodsProgram {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Prisha");
		v.add(null);
		v.add(null);
		v.add("Prisha");
		v.add("Teena");
		System.out.println("my vector is->"+v);
		
		Stack S1 = new Stack();
		//Stack S1 = new Stack<String>(); 
		//to accept homogenous values Strings only, can be removed for hetero values
		S1.add('A');
		S1.add('B');
		S1.add('A');
		S1.add(23.695f);
		System.out.println("\nmy initial Stack is->\n"+S1);
	//	S1.addAll(v);
		//System.out.println("My stack and Vector combined->"+S1);
		System.out.println("\npop removed last obj->\n"+S1.pop());//removes the last object only
		System.out.println("\nremoved last obj then my Stack is->\n"+S1);
		System.out.println("\npeek gives last obj w/o removing->\n"+S1.peek());//Looks at last object without removing from stack
		System.out.println("\npush gives elements of collection->\n"+S1.push(v));//it works as add element displays vector collection
		
		//Enumeration only applicable for legacy classes Stack and vector
		
		Enumeration e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println("\nenumeration gives elements of collection->\n"+e1.nextElement());
		}
		

	}

}
