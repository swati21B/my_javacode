package java_Code;

public class conditionalOperators {
	static void condi()
	{
		int myage=28, daughterage =2, husbandage =32;
		if(!(daughterage<myage||myage>husbandage))
		{
				System.out.println("static if got executed");
		}
		else
		{
			System.out.println("static else got executed");
		}
	}

	public static void main(String[] args) {
		condi();
		int myage=28, husbandage =32;
		if(myage>18 && husbandage<80)
		{
			System.out.println("if got executed");
		}
		else
		{
			System.out.println("else got executed");
		}
		
		
	}
}

