package newpackage;

class  test
{
	public static void call1()
	{
		System.out.println("I am public method");
	}
	private static void call2()
	{
		System.out.println("I am private method");
	}
	protected void call3()
	{
		System.out.println("I am protected method");
	}
	void call4()
	{
		System.out.println("I am default method");
	}
}
public class AccessSpecifier_withinpackage extends test{

	public static void main(String[] args) {
		AccessSpecifier_withinpackage s1 = new AccessSpecifier_withinpackage();
		call1();
		s1.call3();
		s1.call4();
		//call2();//private of other class will not be able to call

		

	}

}