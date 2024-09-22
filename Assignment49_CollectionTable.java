package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Assignment49_CollectionTable {

	public static void main(String[] args) {
		ArrayList A1 = new ArrayList();
		A1.add("Meena");
		A1.add("Seema");
		A1.add("Ram");
		A1.add("Ram");
		System.out.println("before sorting->" +A1);
		Collections.sort(A1);
		System.out.println("after sorting->" +A1);
		A1.add(null);
		A1.add(null);
		A1.add(6);
		A1.add(35.65f);
		A1.add(9);
		A1.add(10);
		A1.add(11);
		A1.add(12);
		System.out.println("increased ArrayList size to 12 from default 10->"+A1);
		
		LinkedList L1 = new LinkedList();
		L1.add(55);
		L1.add(66);
		L1.add(33);
		L1.add(33);
		System.out.println("before sorting->"+L1);
		Collections.sort(L1);
		System.out.println("after sorting->"+L1);
		L1.add(null);
		L1.add(null);
		L1.add("Rama");
		L1.add("Trisha");
		L1.add(9);
		L1.add(10);
		L1.add(11);
		L1.add(12);
		L1.add(13);
		System.out.println("increased LinkedList size to 12->"+L1);
		
		Vector V1 = new Vector();
		V1.add(23);
		V1.add(66);
		V1.add(44);
		V1.add(44);
		System.out.println("before sorting->"+V1);
		Collections.sort(V1);
		System.out.println("after sorting->"+V1);
		V1.add(null);
		V1.add(null);
		V1.add("Aashwi");
		V1.add("Trisha");
		V1.add(9);
		V1.add(10);
		V1.add(11);
		V1.add(12);
		V1.add(13);
		System.out.println("increased Vector size to 12->"+L1);
	
		PriorityQueue PQ1 =new PriorityQueue();
		PQ1.add("Siya");
		PQ1.add("Chetana");
		PQ1.add("Siya");
		PQ1.add("Tanaya");
		PQ1.add("Khush");
		
		//Collections.sort(PQ1);
		//PQ1.add(null);
		PQ1.add("bara");
		PQ1.add("tera");
		//PQ1.add('G');
		//PQ1.add('m');
		//PQ1.add(null);
		System.out.println("PriorityQueue->"+PQ1);
		
		HashSet	h1 = new HashSet();
		h1.add("M1");
		h1.add("Test");
		h1.add("M2");
		h1.add("M3");
		h1.add("M1");
		System.out.println("before sorting->"+h1);
		//Collections.sort(h1);
		//System.out.println("after sorting->"+h1);
		h1.add(null);
		h1.add(56);
		h1.add(null);
		h1.add(20);
		h1.add(99.6235f);
		System.out.println(h1);
		
		LinkedHashSet	Lh1 = new LinkedHashSet();
		Lh1.add(45);
		Lh1.add(33);
		Lh1.add(60);
		Lh1.add(33);
		System.out.println("before sorting->"+Lh1);
		//Collections.sort(h1);
		Lh1.add(null);
		Lh1.add(22);
		Lh1.add(null);
		Lh1.add(99);
		Lh1.add(99.6235f);
		System.out.println(Lh1);
		
		TreeSet ts1 = new TreeSet();
		ts1.add(440);
		ts1.add(33);
		ts1.add(70);
		ts1.add(33);
		System.out.println("before sorting->"+ts1);
		//Collections.sort(ts1);
		//ts1.add(null);
		ts1.add(56);
		//ts1.add(null);
		ts1.add(90);
		//ts1.add("test12");
		
		System.out.println(ts1);	
		
		
	}

}
