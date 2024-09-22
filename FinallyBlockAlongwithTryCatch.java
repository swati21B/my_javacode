package java_Code;

public class FinallyBlockAlongwithTryCatch {

	public static void main(String[] args) {
		int s1 [] = new int[2];
		
		try 
		{
			s1[0]= 5;
			s1[1]= 25;
			s1[2]= 99;//we are getting exception due to this line
			
		}
		catch(ArrayIndexOutOfBoundsException k)
		{
			System.out.println("catch 1 executed");
		}
		
		finally
		{
			System.out.println("No matter what finally will always executed");
		}

	}

}
