package java_Code;

public class IIB_Block {

		//IIB
		{
			System.out.println("IIB 1");
		}
		{
			System.out.println("IIB 2");
		}
		{
			System.out.println("IIB 3");
		}
		//constructor
		IIB_Block()
		{
			System.out.println("constructor invoked 1");
		}
		
		//IIB
		{
			System.out.println("IIB 4");
		}
		
		//SIB
		static
		{
			System.out.println("SIB invoked");
		}
		public static void main(String[] args)
		{
			new IIB_Block();
//invokes the IIB first then constructor and then next line as main method execution is line by line
			System.out.println("main method invoked");
		}
		}
//order of execution is> SIB, main method, IIB, and constructor
//order of output is line by line-->SIB first always, control goes to main method-> object is created first hence executes the IIB then constructor and then main method
