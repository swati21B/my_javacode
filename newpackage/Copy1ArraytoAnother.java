package newpackage;

import java.util.Arrays;

public class Copy1ArraytoAnother {

	public static void main(String[] args) {
		int age [] = new int[4];
		age[0]= 12;
		age[1]=25;
		age[2]=40;
		age[3]=74;
		
		int output[]= new int[4];
		for(int i=0;i<4;i++)
		{
			output[i] =age[i];
		}
		System.out.println("my input array->" +Arrays.toString(age));
		System.out.println("my output array->"+Arrays.toString(output));
		
	}

}
