package newpackage;

interface parent
{
	void google_auth();
	void facebook_auth();
}

public class childtest implements parent{
	public void google_auth() {
		
	System.out.println("google_auth");
		
	}

	
	public void facebook_auth() {
	System.out.println("facebook_auth");
		
	}

	public static void main(String[] args) {
		childtest m1 = new childtest();
		m1.google_auth();
		m1.facebook_auth();
		
	}

	
	

}
