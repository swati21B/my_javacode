package java_Code;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_HandlingwithScanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int age [] = new int[2];
		try
		{
		for(int i=0;i<2;i++)
		{
			age [i]=s1.nextInt();
			System.out.println(age);
		}
		
		}
		catch(InputMismatchException c1)
		{
		System.out.println("Enter the number");
		Scanner s2 = new Scanner(System.in);
		int age2 = s2.nextInt();
		System.out.println(age2);
		try
		{
			Scanner s3 = new Scanner(System.in);
			int age3 = s3.nextInt();
			System.out.println(age3);
		}
		catch(InputMismatchException c2)
		{
			System.out.println("Enter the number");
			Scanner s4 = new Scanner(System.in);
			int age4 =s4.nextInt();
			System.out.println(age4);
		}
		
		}

	}

}
