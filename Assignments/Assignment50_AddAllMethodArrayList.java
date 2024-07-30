package Assignments;

import java.util.ArrayList;

public class Assignment50_AddAllMethodArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Prisha");
		a1.add("Prasad");
		a1.add("Swati");
		System.out.println("my a1 is->"+a1);
		
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		a2.add("Teena");
		a2.add("Teena");
		System.out.println("my a2 is->"+a2);
		a2.add(null);
		a2.add(true);
		a1.addAll(a2);
		System.out.println("a1 together with a2->"+a1);

	}

}
