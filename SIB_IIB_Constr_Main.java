package Assignments;

public class SIB_IIB_Constr_Main {
		//SIB
		static
		{
			System.out.println("SIB 1");
		}
		static
		{
			System.out.println("SIB 2");
		}
		//IIB
		{
			System.out.println("IIB 1");
		}
		{
			System.out.println("IIB 2");
		}
		
		//Constructor
		SIB_IIB_Constr_Main()
		{
			System.out.println("Constructor");
		}
		public static void main(String[] args) {
			new SIB_IIB_Constr_Main();
			System.out.println("main method");
			new SIB_IIB_Constr_Main();
	}

}
