package java_Code;
abstract class Class3
{
	abstract void add();
	abstract void sunstract();
}

class Class2 extends Class3
{
	static void mul()
	{
		System.out.println("Mul");
	}
	void div()
	{
		System.out.println("div");
	}
	
	void add() {
		System.out.println("logic is here");
		
	}
	
	void sunstract() {
		
		System.out.println("logic is here 2");
	}
}
public class Class1 extends Class2{ 
	//we can override abstract methods here also and for that we need to make parent class2 as abstract class
	
	static void test1()
	{
		System.out.println("test1");
	}
	void test2()
	{
		System.out.println("test2");
	}

	public static void main(String[] args) {
		Class1 o1 = new Class1();
		o1.add();
		o1.sunstract();
		mul();
		o1.div();
		o1.test1(); //static can also call by object 
		o1.test2();

	}

}
