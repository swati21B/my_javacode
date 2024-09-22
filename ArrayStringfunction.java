package java_Code;

import java.util.Arrays;

public class ArrayStringfunction {

	public static void main(String[] args) {
		String name [] = new String[3];
		name[0] ="Prisha";
		name[1]= "Teena";
		name[2] = "Aaru";
		
		System.out.println(Arrays.toString(name));
		int [] rolln = new int[3];
		rolln[0] =21;
		rolln[1] =55;
		rolln[2] =25;
		System.out.println(Arrays.toString(rolln));
		
		char gender [] = new char[3];
		gender[0] ='F';
		gender[1]= 'M';
		gender[2] = 'O';
		System.out.println(Arrays.toString(gender));
		
		Boolean foodready [] = new Boolean[4];
		foodready[0] = true;
		foodready[1] = true;
		foodready[2] = true;
		foodready[3] = false;
		System.out.println(Arrays.toString(foodready));

	}

}
