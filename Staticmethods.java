package java_Code;

public class Staticmethods {
	static void findgender()
	{
		char gender = 'F';
		System.out.println(gender);
	}
	static void TVOnOff()
	{
		boolean TV = true;
		System.out.println(TV);
	}
	static void addition()
	{
		int age = 15+5;
		System.out.println(age);
	}
	public static void substraction()
	{
		float weightofchild = 20.5f;
		double weightofadult = 80.5642;
		double weightdifference1 = weightofadult -weightofchild;
		System.out.println(weightdifference1);
	}
	static void multiplication(int a, int b)
	{
		System.out.println("Hellow I am parameterised static method");
	}
	static void division(int a, int b)
	{
		System.out.println("Hellow I am again parameterised static method");
	}
	static void mod(int c, int d)
	{
		c = 13;
		d = 2;
		int performmod= c%d;
		System.out.println(performmod);
	}
	public static void main(String[] args) {
		findgender();
		TVOnOff();
		addition();
		substraction();
		System.out.println("my name is swati");
		multiplication(25, 4);
		division(15, 5);
		mod(12, 2);
	}
}
