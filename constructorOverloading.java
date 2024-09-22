package java_Code;

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
constructorOverloading(float f)
{
	System.out.println("another syntax used");
}

	public static void main(String[] args) {
		// two syntax to create constructors 
		//constructorOverloading test = new constructorOverloading();
		//new constructorOverloading();
		new constructorOverloading();
		new constructorOverloading(20,50);
		new constructorOverloading('K');
		new constructorOverloading("test");
		constructorOverloading test = new constructorOverloading(256.695f);

		
	}

}
