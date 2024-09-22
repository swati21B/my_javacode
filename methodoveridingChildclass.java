package java_Code;
class parentclass
{
	void tyre()
	{
		System.out.println("MRF");
		//overriding means suppressed here, parent class method suppressed by child
	}
}
public class methodoveridingChildclass extends parentclass{
	// method overriding concept using super keyword to get parent class implementation together with child class 
	void tyre()
	{
		//super.tyre(); 
//without super keyword we are not able to get parent class implementation
		System.out.println("Apollo");
	}

	public static void main(String[] args) {
		
		methodoveridingChildclass b1 =new methodoveridingChildclass();
		b1.tyre();

	}

}
