package java_Code;

public class Static_Block {

		//SIB -Static initialisation Block
	static
	{
		System.out.println("Static block executed-2");
	}
	static
	{
		System.out.println("Static block executed-1");
	}
	static
	{
		System.out.println("Static block executed-3");
	}
	static
	{
		System.out.println("Static block executed-4");
	}
	static
	{
		System.out.println("Static block executed-5");
	}
	Static_Block()
	{
		System.out.println("my constructor");
	}
	
	//IIB-Instance initialisation block
	{
		System.out.println("IIB executed");
	}
		public static void main(String[] args) {
		System.out.println("main method invoked");
		new Static_Block();
			
		}

	}
