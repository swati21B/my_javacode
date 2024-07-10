package newpackage;
class parentcall // parent constructor
{
	parentcall(int a)
	{
		System.out.println("Swati");
	}
}

public class ParameterisedSuperCalling extends parentcall { // child constructor
	ParameterisedSuperCalling()
	{
		super(25);//calling parameterised constructor explicitly
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		new ParameterisedSuperCalling();
	}

}
