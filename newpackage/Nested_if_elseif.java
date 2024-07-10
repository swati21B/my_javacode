package newpackage;

public class Nested_if_elseif {
	public static void main(String[] args) {
		int age=17;
		if(age<=15)
		{
			System.out.println("if statement false");
		}
		else if(age>=15)//true
		{
			System.out.println("age is greater than 15");
		}
		else if(age<18)//true Note: whichever first condition is true in if else if statement only executes and other will be ignored
		{
			System.out.println("age needs to be 18 to vote");
		}
		else
		{
			System.out.println("else executed");
		}
	}

}
