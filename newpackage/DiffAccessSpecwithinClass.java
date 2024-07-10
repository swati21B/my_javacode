package newpackage;

public class DiffAccessSpecwithinClass {
	public void call1()
	{
		System.out.println("I am public method");
	}
	private void test1()
	{
		System.out.println("I am private method");
	}

	protected void test2()
	{
		System.out.println("I am protected method");
	}
	
	void test3()
	{
		System.out.println("I am default/package method");
	}
	public static void main(String[] args) {
		DiffAccessSpecwithinClass ab = new DiffAccessSpecwithinClass();
		ab.call1();
		ab.test1();
		ab.test2();
		ab.test3();

	}

}
