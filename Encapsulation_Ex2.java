package java_Code;
class Google_Auth
{
	private String apikey ="vvkncazsbgbpjdcogxrcsxxlvpxaihth";
	
	public void setapikey(String apikey)
	{
		this.apikey =apikey;
	}
	public String getapikey()
	{
		return apikey;
	}
	
	private String Username ="Swati123";

	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		this.Username = username;
	}
	
}

public class Encapsulation_Ex2 {

	public static void main(String[] args) {
		Google_Auth s1 = new Google_Auth();
		
		s1.setapikey("mntmodaxptpixcxdvbwhmnjrezlochjo");
		System.out.println(s1.getapikey());
		
		s1.setUsername("Mahika");
		System.out.println(s1.getUsername());
		

	}

}
