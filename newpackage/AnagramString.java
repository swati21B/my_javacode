package newpackage;

import java.util.Arrays;

public class AnagramString {
	// words are anagram to each other care and race (has same alphabets to form meaningful word

	public static void main(String[] args) {
		String one = "race";
		String two = "care";
		
		char [] c1 = one.toCharArray(); //string converted to char array
		char [] c2 = two.toCharArray();
		
		System.out.println(Arrays.toString(c1)); //string converted to array form
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);//function sorts alphabetically
		System.out.println("sort alphabetically->"+Arrays.toString(c1));
		Arrays.sort(c2);
		System.out.println("sort alphabetically->"+Arrays.toString(c2));	
		System.out.println("We can see above string is anagram to each other");
	}

}
