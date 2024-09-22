package java_Code;

public class Nested_if_else {
int a =100;//global variable
	public static void main(String[] args) {
		float salary =20.55f;//local variable
		if(salary!=15)
		{
			System.out.println("my if statement executed");
			if(salary>=15)
			{
				System.out.println("if statement executed: my salary greater than 15");
			}
			else
			{
				System.out.println("else statement executed: my salary not greater than 15");
			}
			if(salary==15)
			{
				System.out.println("if statement executed: my salary greater than 15");
			}
			else
			{
				System.out.println("if statement executed: my salary not equals to 15");
			}
		}
		else
		{
			System.out.println("my else statement executed");
		}
		}
		

	}

