package java_Code;

public class thiscallingstatement {
	thiscallingstatement()
	{
		System.out.println("non-para");
	}
	thiscallingstatement(int age)
	{
		this();//always explicitly
		System.out.println(age);
	}
	thiscallingstatement(String email)
	{
		this(25);//always explicitly
		System.out.println(email);
	}
	thiscallingstatement(char b)
	{
		this("abc@gmail.com");//always explicitly
		System.out.println(b);
	}

	public static void main(String[] args) {
		new thiscallingstatement('A');

	}

}
