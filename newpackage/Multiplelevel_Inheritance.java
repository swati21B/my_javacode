package newpackage;
interface add
{
	void test1();
	void test2();
}
interface sub
{
	void test3();
	void test4();
}

public class Multiplelevel_Inheritance implements add, sub
{
	public void test3() {
		System.out.println("test3");
		
	}

	
	public void test4() {
		
		System.out.println("test4");
	}

	
	public void test1() {
		System.out.println("test1");
		
	}

	
	public void test2() {
		System.out.println("test2");
		
	}
	public static void main(String[] args) {
		Multiplelevel_Inheritance a1 = new Multiplelevel_Inheritance();
		a1.test1();
		a1.test2();
		a1.test3();
		a1.test4();

	}


}
