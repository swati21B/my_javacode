package java_Code;

public class tryCatchFinally {

	public static void main(String[] args) {
		
		
		try
		{
			int num []= {1,5,6};// index available are 0,1,2
			System.out.println("num at index 3"+num[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("I will always execute");
		}
		

	}

}
