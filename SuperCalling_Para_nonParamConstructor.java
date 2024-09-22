package java_Code;
class num1
{
	num1(int b)
	{
		System.out.println("num1");
	}
}
class num2 extends num1
{
	num2(String name)
	{
		super(20);
		System.out.println("num2");
	}
}
class num3 extends num2
{
	num3()
	{
		super("swati");
		System.out.println("num3");
	}
}

public class SuperCalling_Para_nonParamConstructor extends num3{ //child constructor
	SuperCalling_Para_nonParamConstructor()
	{
		System.out.println("child constructor");// super implicitly present for non-parameterised constructor
	}

	public static void main(String[] args) {
		new SuperCalling_Para_nonParamConstructor();//calling child constructor

	}

}
