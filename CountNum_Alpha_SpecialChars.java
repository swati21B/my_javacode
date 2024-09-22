package java_Code;

import java.util.Arrays;

public class CountNum_Alpha_SpecialChars {

	public static void main(String[] args) {
		int countofAlpha =0;
		int countofNum =0;
		int countofSpaces =0;
		String name = "Prisha123 #%@";
			char [] c1=	name.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println("total chars in string->"+name.length());
		for(int i=0;i<name.length();i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			boolean b2= Character.isDigit(c1[i]);
			boolean b3= Character.isWhitespace(c1[i]);
			//boolean 
			if(b1==true)
			{
				countofAlpha++;
			}
			if(b2==true)
			{
				countofNum++;
			}
			if(b3==true)
			{
			countofSpaces++;
			}
			
		}
		System.out.println("Total number of aplhabets are -> "+countofAlpha);
		System.out.println("Total number of numeric are -> "+countofNum);
		System.out.println("Total number of spaces are -> "+countofSpaces);
		int b4 = name.length()-(countofAlpha+countofNum+countofSpaces);
		System.out.println("Total number of special chars are -> "+b4);
	}
}
