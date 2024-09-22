package java_Code;

class myparentc
{
	void add()
	{
		System.out.println("add method in parent class");
	}
	final void tyre()
	{
		System.out.println("MRF");
	}
}
public class Final_No_one_canOverrideMethod extends myparentc{
	//cannot override tyre method as it's final in parent class
	/*void tyre()
	{
		super.tyre();
		System.out.println("Apollo");
	}
	*/
	void add()
	{
		super.add();
		System.out.println("add method in child class");
	}

	public static void main(String[] args) {
		
		Final_No_one_canOverrideMethod b1 =new Final_No_one_canOverrideMethod();
		b1.tyre();
		b1.add();

	}

}
