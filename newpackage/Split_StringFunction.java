package newpackage;

import java.util.Arrays;

public class Split_StringFunction {

	public static void main(String[] args) {
		String intro = "My name is Swati";
	String [] s1 =	intro.split((" "));
	String [] s2 =intro.split(" ", 3); // limit 3 is 2 commas
	System.out.println(Arrays.toString(s1));
	System.out.println(Arrays.toString(s2));

	}

}
