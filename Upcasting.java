package Collection;

class ParentClass
{
	void add()
	{
		System.out.println("add method from parent class");
	}
	void sub()
	{
		System.out.println("sub method from parent class");
	}
}

public class Upcasting extends ParentClass{
	void mul()
	{
		System.out.println("mul method from child class");
	}
	void div()
	{
		System.out.println("div method from child class");
	}

	public static void main(String[] args) {
		//upcasting can be done implicit and explicit
	ParentClass p1 = new Upcasting();	//implicitly
	//ParentClass p1 = (ParentClass) new Upcasting();//explicitly
	p1.add();
	p1.sub();
	System.out.println("Achieved upcasting concept");
	
	//Downcasting is not possible without upcasting
	//Downcasting can be done only explicitly
	Upcasting d1 = (Upcasting) p1;
	d1.add();
	d1.sub();
	d1.mul();
	d1.div();
	System.out.println("Achieved downcasting");
	}

}
