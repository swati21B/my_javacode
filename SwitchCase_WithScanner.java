package java_Code;

import java.util.Scanner;

public class SwitchCase_WithScanner {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter days->");
		int days= sc1.nextInt();
		
		switch(days) 
		{
		case 1:
			System.out.println("Weekdays");
			break;
		case 5:
			System.out.println("Weekdays: Soon it is Weekend");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend: Monday is coming soon");
			break;
		
		default:
				System.out.println("Looking forward to the Weekend");
		}

	}

}
