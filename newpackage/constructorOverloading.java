package newpackage;

public class constructorOverloading {
public constructorOverloading()
{
	System.out.println("calling my non-parameterised constructor");
}
constructorOverloading(int a, int b)
{
	System.out.println("calling my parameterised constructor");
}
constructorOverloading(String Z)
{
	System.out.println("Again calling my parameterised constructor");
}

constructorOverloading(char a)
{
	System.out.println("calling my parameterised constructor again");
}

	public static void main(String[] args) {
		constructorOverloading test = new constructorOverloading();
		//new constructorOverloading(); //another syntax to create constructor reference variable
		new constructorOverloading();
		new constructorOverloading(20,50);
		new constructorOverloading('K');
		new constructorOverloading("test");
		
	}

}
