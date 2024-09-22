package java_Code;

public class Assignment4 {
	final static double pi = 3.14;
	
	void areaofCircle()
	{
		int r= 5;
		double area =pi*r*r;
		System.out.println(area);
	}
	public static void CircumferenceofCircle()
	{
		int r= 10;
		double circumference =2*pi*r;
		System.out.println(circumference);
	}

	public static void main(String[] args) {
		Assignment4	o1= new Assignment4();
		o1.areaofCircle();
		CircumferenceofCircle();
		
	}

}
