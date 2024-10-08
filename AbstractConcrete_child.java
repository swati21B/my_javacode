package java_Code;

abstract class myparent
/*
  Write a program using with abstract class-Abstract class (2 abstract methods,2 concrete methods) and class have 2 concrete methods
 */
{
	abstract void login();//non-static in nature
	abstract void logout();
	
	//concrete methods can be static and non-static	
	static void add()
	{
		System.out.println("parent concrete method 1");
	}
	void sub()
	{
		System.out.println("parent concrete method 2");
	}
}


public class AbstractConcrete_child extends myparent {
	void login() { //abstract overridden methods
		System.out.println("test 1");
	}

	void logout() {
		System.out.println("test 2");
	}
	
	static void mul() //concrete methods of child
	{
		System.out.println("concrete method of child 1");
	}
	void div()
	{
		System.out.println("concrete methods of child 1 test");
	}
	public static void main(String[] args) {
		AbstractConcrete_child  o1 = new AbstractConcrete_child ();
		o1.login();
		o1.logout();
		o1.sub();
		o1.add();
		o1.div();
		o1.mul();
		

	}

	
	

}
