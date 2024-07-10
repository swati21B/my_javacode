package newpackage;
class parentclass
{
	void tyre()
	{
		System.out.println("MRF");
	}
}
public class methodoveridingChildclass extends parentclass{
	// method overriding concept using super keyword to get parent class implementation together with child class 
	void tyre()
	{
		super.tyre();
		System.out.println("Apollo");
	}

	public static void main(String[] args) {
		
		methodoveridingChildclass b1 =new methodoveridingChildclass();
		b1.tyre();

	}

}
