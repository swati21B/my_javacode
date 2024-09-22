package java_Code;

public class Try_CatchBlock {

	public static void main(String[] args) {
		String [] a1 = new String[2];
		a1[0] = "Chiu";
		a1[1] = "Ram";
		try
		{
		a1[3] ="Swati";
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("I handled the exception");
		}
		
		

	}

}
