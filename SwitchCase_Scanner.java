package java_Code;

import java.util.Scanner;

public class SwitchCase_Scanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = s1.nextDouble();
		System.out.println("Enter second number");
		double num2 = s1.nextDouble();
		
		System.out.println("Enter the operators +, -, *, /:");
		
		char operator = s1.next().charAt(0);
		// as scanner class don't have nextchar method we need to combine String +charAt(0)
		double result;
		
		switch(operator)
		{
		case '+':
			result = num1+num2;
			System.out.println("the result is"+result);
			break;
		
		case '-':
			result = num1-num2;
			System.out.println("the result is"+result);
			break;
		case '*':
			result= num1*num2;
			System.out.println("the result is"+result);
			break;
		case '/':
			result= num1/num2;
			System.out.println("the result is"+result);
			break;
		default:
			System.out.println("Invalid operator");
			
		}
		
		

	}

}
