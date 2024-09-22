package java_Code;
class Alphabet_auth { //Example of multy level inheritance of static methods
	//grandparent class
	static void auth1()
	{
		System.out.println("I am super of super class");
	}
	
}
class Google_auth extends Alphabet_auth{// parent class
	static void auth2()
	{
		System.out.println("I am super class");
	}
	
}

public class staticmultylevel_Amazon_auth extends Google_auth{//child class
	static void auth3()
	{
		System.out.println("I am child class");
	}

	public static void main(String[
	                               ] args) {
		auth3();
		auth1();
		auth2();
		

	}

}
