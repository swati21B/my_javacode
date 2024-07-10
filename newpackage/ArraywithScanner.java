package newpackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArraywithScanner {

	public static void main(String[] args) {
		
		Scanner o1 = new Scanner(System.in);
		int rollnum [] = new int[3];
		for(int i=0;i<3;i++)
		{
			rollnum [i] = o1.nextInt();
		}
		System.out.println(Arrays.toString(rollnum));
		
		double elebill []= new double[3];
		for(int i=0;i<3;i++)
		{
		elebill [i] = o1.nextDouble();
		}
		System.out.println(Arrays.toString(elebill));
		
		boolean aadhar[] = new boolean[3];
		for(int i=0;i<3;i++)
		{
			aadhar[i] = o1.nextBoolean();
		}
		System.out.println(Arrays.toString(aadhar));
	}

}
