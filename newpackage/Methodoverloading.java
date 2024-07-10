package newpackage;

public class Methodoverloading {
	static void upload()
	{
		System.out.println("I am static non-parameterised");
	}
	static void upload(int a)
	{
		System.out.println("I am static parameterised method");
	}
	static void upload(double a)
	{
		System.out.println("I am again static parameterised method");
	}
	void upload(int a, int b)
	{
		System.out.println("I am non-static parameterised method");
	}
	void upload(int b, char a)
	{
		System.out.println("I am again non-static parameterised method");
	}
	void upload(String msg)
	{
		System.out.println("I am non-static parameterised method");
	}
	/*void upload() --> static non-static both can't be non-parameterised, here needs to pass argument for variations
	{
		System.out.println("I am static non-parameterised");
	}
	*/

	public static void main(String[] args) {
		Methodoverloading myref = new Methodoverloading();
		upload();
		upload(10);
		upload(3.145698);
		myref.upload(50, 5);
		myref.upload(12, 'K');
		myref.upload("Ohh");
		
	}

}
