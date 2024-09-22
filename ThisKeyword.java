package java_Code;

public class ThisKeyword {
	int age;
	String name;
	float weight;
	
	void mynonstaticMethod(int age, String name, float weight)
	{
		this.age =age;
		this.name =name;
		this.weight =weight;
		
	}
	public static void main(String[] args) {
		ThisKeyword a1 = new ThisKeyword();
		a1.mynonstaticMethod(25, "Prisha", 45.56f);
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.weight);

	}

}
