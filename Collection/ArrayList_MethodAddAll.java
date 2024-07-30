package Collection;

import java.util.ArrayList;

public class ArrayList_MethodAddAll {

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
		ArrayList a3 = new ArrayList(2);
		a3.add("Masha");
		a3.add("Bare");
		System.out.println("my a3 is->"+a3);
		a2.addAll(3, a3);//parameters are index and collection
		System.out.println("my a2 & a3 is now->"+a2);
		a1.remove(2);
		System.out.println("removed index 2 from a1->"
		+a1);
		a2.removeAll(a1);
		System.out.println("my a2 is->"+a2);
		
		System.out.println("size of a3->"+a3.size());
		System.out.println("Is a3 contains bare->"+a3.contains("Bare"));
		System.out.println("a3 is empty->"+a3.isEmpty());
		System.out.println("is a2 contains a3->"+a2.containsAll(a3));
		a3.clear();
		System.out.println("clear a3->"+a3);
		

	}

}
