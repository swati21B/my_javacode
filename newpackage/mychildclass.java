package newpackage;
interface test2
{
	void google();
	void facebook();
}

interface test1 extends test2
{
	void amazon();
	void flipkart();
}

public class mychildclass implements test1{
	public void google() {
		
		System.out.println("google");
	}


	public void facebook() {
		System.out.println("facebook");
		
	}

	
	public void amazon() {
		System.out.println("amazon");
		
	}

	
	public void flipkart() {
		System.out.println("flipkart");
		
	}

	public static void main(String[] args) {
		mychildclass s1 = new mychildclass();
		s1.google();
		s1.facebook();
		s1.amazon();
		s1.flipkart();

	}


}
