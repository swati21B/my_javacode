package java_Code;

public class PalindromeString {

	public static void main(String[] args) {
		String name = "madam";
		String output ="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1 =name.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
		if(name.equals(output))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	
	}

}
