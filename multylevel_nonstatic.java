package java_Code;

class testing1
{
	void test1()
	{
		System.out.println("I am non-static super parent class");
	}	
}
class testing2 extends testing1
{
	void test2()
	{
		System.out.println("I am non-static parent class");
	}
}


public class multylevel_nonstatic extends testing2
{
	void test0()
	{
		System.out.println("I am non-static child class");
	}

	public static void main(String[] args) {
		multylevel_nonstatic myobj = new multylevel_nonstatic();
		myobj.test0();
		myobj.test2();
		myobj.test1();
		
		
		

	}

}
