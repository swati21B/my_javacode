package java_Code;
class new1
{
	void login()
	{
		System.out.println("login from parent");
	}
}

public class SuperKeyword_MethodOverriding extends new1{
	void login()
	{
		super.login();
		System.out.println("login from child");
	}

	public static void main(String[] args) {
		SuperKeyword_MethodOverriding o1 = new SuperKeyword_MethodOverriding();
		o1.login();

	}

}
