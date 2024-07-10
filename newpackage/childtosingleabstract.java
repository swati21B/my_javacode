package newpackage;

abstract class myabstract
{
	abstract void login();
	abstract void logout();
}

public class childtosingleabstract extends myabstract{
	void login() {
		
		System.out.println("Main logic will be here");
	}

	
	void logout() {
		
		System.out.println("Main logic will be here part 2");
	}
	public static void main(String[] args) {
		childtosingleabstract m1 = new childtosingleabstract();
		m1.login();
		m1.logout();

	}


}
