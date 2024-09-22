package java_Code;

class myParentclass
{
	void login()
	{
		System.out.println("Login with email id");
	}
}

public class RunTimePolymorphism extends myParentclass{
	void login()
	{
		System.out.println("Login with mobile num");
	}

	public static void main(String[] args) {
		//polymorphism means performing same action in different ways
/*Earlier we call child class method by creating object but with run time 
		polymorphism we can create object of parent class and call it's methods too*/
		RunTimePolymorphism a1=new RunTimePolymorphism();
		a1.login();
		myParentclass r1 = new myParentclass();
		r1.login();
		

	}

}
