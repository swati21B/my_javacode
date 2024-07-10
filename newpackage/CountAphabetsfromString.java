package newpackage;

import java.util.Arrays;

public class CountAphabetsfromString {

	public static void main(String[] args) {
		int coutofAlpha =0;
		String name ="Prisha07";
		char c1[] =name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<name.length();i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				coutofAlpha++;
			}
			
		}
		System.out.println("Count of alphabets->"+coutofAlpha);
		
	}

}
