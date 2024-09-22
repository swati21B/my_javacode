package java_Code;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner reg = new Scanner(System.in);// System.in to take input on run time
		System.out.println("Enter first name:");
		reg.next();
		System.out.println("Enter last name:");
		reg.next();
		System.out.println("Enter email:");
		reg.next();
		System.out.println("Enter password:");
		reg.next();
		System.out.println("Enter gender:");
		reg.next();
		System.out.println("Enter present address:");
		reg.next();
		System.out.println("Enter permenant address:");
		reg.next();
		System.out.println("Enter pincode:");
		reg.nextLong();
		reg.close();
	}

}
