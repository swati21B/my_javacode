package Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment48_NestedtryCatch {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		long mobNum []= new long[3];
		try
		{
			System.out.println("Enter mobile number");
			mobNum[0] = s1.nextLong();
			mobNum[1] = s1.nextLong();
			mobNum[2] = s1.nextLong();
			
		}
		catch(InputMismatchException b)
		{
			try
			{
				Scanner s2 = new Scanner(System.in);
				System.out.println("Enter valid mobile number");
				mobNum[0] = s2.nextLong();
				mobNum[1] = s2.nextLong();
				mobNum[2] = s2.nextLong();
			}
			catch(InputMismatchException c)
			{
				System.out.println("mobile number is incorrect");
			}
			finally
			{
				System.out.println("Exit");
			}
		}
		
	}

}
