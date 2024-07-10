package newpackage;

import java.util.Arrays;

public class CharArrayFunction {

	public static void main(String[] args) {
		String myname = "Swati";
		char [] a = myname.toCharArray();
		/*for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]); //output chars of myname line by line
		}*/
		System.out.println(Arrays.toString(a)); //outputs all chars in array form
		
		
	}

}
