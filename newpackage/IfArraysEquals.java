package newpackage;

import java.util.Arrays;

public class IfArraysEquals {

	public static void main(String[] args) {
		String name []= new String[3];
		 name [0] = "Swati";
		 name [1] = "Prisha";
		 name [2] = "Aaru";
		 
		 String name1 []= new String[3];
		 name1 [0] = "Swati";
		 name1 [1] = "Prisha";
		 name1 [2] = "Aaru";
		 System.out.println(Arrays.equals(name, name1));
		 

	}

}
