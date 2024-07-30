package Collection;

import java.util.ArrayList;

public class ArrayListGetSetMethods {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Prisha");
		a1.add("Prasad");
		a1.add("Swati");
		a1.add("Swati");
		System.out.println("my a1 is->"+a1);
		//get method to fetch value
		System.out.println(a1.get(1));
		//set method to replace value
		a1.set(3, "Prisha");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
	//invoking another collection element with addAll
		a2.addAll(a1);
		a2.add("Teena");
		a2.add("Teena");
		System.out.println(a1.indexOf("Prasad"));
		

	}

}
