package Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment47_tryCatch {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int age[] = new int[3];
		try
		{
		age[0] =s1.nextInt();
		age[1]= s1.nextInt();
		age[2]= s1.nextInt();
		}
		catch(InputMismatchException a)
		{
			System.out.println("I handled the exception");
		}
	}

}
