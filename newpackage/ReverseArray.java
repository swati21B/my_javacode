package newpackage;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int array [] = new int[4];
		array[0]= 12;
		array[1]=25;
		array[2]=40;
		array[3]=74;
	
		   int reverse[]= new int[array.length];
		   for(int i=array.length-1,j=0;i>=0&&j<=array.length-1;i--,j++)
		   {
			           reverse[j]=array[i];
			         
		   }
		   System.out.println("input array->"+Arrays.toString(array));
			System.out.println("reveresed array->"+Arrays.toString(reverse));

	}

}
