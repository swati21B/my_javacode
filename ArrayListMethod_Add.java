package Collection;

import java.util.ArrayList;

public class ArrayListMethod_Add {

	public static void main(String[] args) {
		//create object of ArrayLIst, ArrayList is method of Collection interface
		//cntr+shift+o short cut to import package
		ArrayList o1 = new ArrayList();
//method of ArrayList -->add.(object) object is parameter ->we can store heterogenous values
		o1.add("Ram");
		o1.add("Prisha");
		o1.add("Mom");
		o1.add('A');
		o1.add(89);
		o1.add(true);
		o1.add("DAD");
		o1.add(null);
		o1.add(null);
		o1.add("DAD");
		o1.add(89.333f);
		System.out.println(o1);
	}

}
