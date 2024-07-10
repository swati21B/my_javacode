package newpackage;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Prisha";
		String output ="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char a1 =name.charAt(i);
			/*System.out.println(a1); 
 we can reverse this way but it gives output in the form of char but we need string*/
			output = output+ a1;		
			
		}
		
		System.out.println(output);	
		

	}

}
