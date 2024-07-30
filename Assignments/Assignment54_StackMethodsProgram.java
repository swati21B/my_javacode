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
		S1.add('A');
		S1.add('B');
		S1.add('A');
		S1.add(23.695f);
		
	//	S1.addAll(v);
		//System.out.println("My stack and Vector combined->"+S1);
		System.out.println(S1.pop());//removes the last object only
		System.out.println("my Stack is now->"+S1);
		System.out.println(S1.peek());//Looks at last object without removing from stack
		System.out.println(S1.push(v));//it works as add element displays vector collection
		//Enumeration only applicable for legacy classes Stack and vector
		
		Enumeration e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		

	}

}
