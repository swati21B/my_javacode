package java_Code;
import java.util.Scanner;
public class ScannerallMethods {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the birth year of person");
		s1.nextInt();
		System.out.println("Enter the email of person");
		s1.next();
		System.out.println("Enter the age of person");
		s1.nextByte();
		System.out.println("Enter the year of joining company");
		s1.nextShort();
		System.out.println("Enter the salary of person");
		s1.nextLong();
		System.out.println("Enter the weight of person");
		s1.nextFloat();
		System.out.println("Enter the bank saving of person");
		s1.nextDouble();
	}

}
