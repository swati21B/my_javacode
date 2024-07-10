package newpackage;
class Father// parent class
{
	static void House()
	{
		System.out.println("Father has house");
	}
	static void Car()
	{
		System.out.println("Father has car");
	}
	
}
public class singlelevelinheritance extends Father { // child class
	static void Laptop()
	{
		System.out.println("Child has laptop");
	}
	static void Bike()
	{
		System.out.println("Child has bike");
	}
	

	public static void main(String[] args) {
		Laptop();
		Bike();
		House();
		Car();

	}

}
