package newpackage;

public class Non_staticmethod {
	public void mymobnum()
	{
		System.out.println("I am non-sattic non parameterised method");
	}
	void myemail(String email)
	{
		System.out.println(email);
	}
	void myemail(String email, char a)
	/*method overloading concept is used method name can be same 
	 in static and non-static methods but there should be variations in the arguments*/
	{
		System.out.println("I am again non-sattic parameterised method");
	}

	public static void main(String[] args) {
		//create object reference variable to call non-static method
		Non_staticmethod Ref = new Non_staticmethod();
		Ref.mymobnum();
		Ref.myemail("swatibodhale215@gmail.com");
		System.out.println("I am main method");
		Ref.myemail("abc@gmail.com", 'H');
	}

}
