package newpackage;
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

public class ComboofPara_nonParamSupercall extends num3{ //child constructor
	ComboofPara_nonParamSupercall()
	{
		System.out.println("child constructor");// super implicitly present for non-parameterised constructor
	}

	public static void main(String[] args) {
		new ComboofPara_nonParamSupercall();//calling child constructor

	}

}
