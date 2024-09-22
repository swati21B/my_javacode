
package java_Code;

class parentone //team lead
{
	private int age = 18;//for me this is sensitive info
	public void setAge(int age) //setter method
	{
		this.age =age;
	}
	public int getAge() //getter method
	{
		return age;
	}
}

public class Encapsulation_retuenKeyword {

	public static void main(String[] args) {
		parentone a1 = new parentone();
		a1.setAge(40);
		System.out.println(a1.getAge());
		//As getter method returns only and not prints hence writting under println

	}

}
