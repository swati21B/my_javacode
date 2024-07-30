package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Prisha");
		a1.add("Prasad");
		a1.add("Swati");
		a1.add("Swati");
		System.out.println("my a1 is->"+a1);
		
		LinkedList l1 = new LinkedList();
		l1.add('A');
		l1.add("Swati");
		l1.add('C');
		l1.add('Z');
		System.out.println("my l1 is->"+l1);
		System.out.println(l1.getFirst());//getting first object
		System.out.println(l1.getLast());
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
		
	}

}
