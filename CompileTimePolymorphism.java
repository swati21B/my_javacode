package java_Code;

public class CompileTimePolymorphism {
	
	static void uploadphoto()
	{
		System.out.println("method 1");
	}
	static void uploadphoto(int a)
	{
		System.out.println("method 2");
	}
	void uploadphoto(int a, double d)
	{
		System.out.println("method 3");
	}
	void uploadphoto(float f)
	{
		System.out.println("method 4");
	}
	

	public static void main(String[] args) {
	//polymorphism means performing same action in different ways
//method overloading is an example of Compile Time Polymorphism
		
		uploadphoto();
		uploadphoto(90);
		CompileTimePolymorphism c1 = new CompileTimePolymorphism();
		c1.uploadphoto(14f);
		c1.uploadphoto(12, 0.0455);
	}

}
