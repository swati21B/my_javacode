package java_Code;

public class ForLoop_Areaofcircle {
final static double pi = Math.PI;
	public static void main(String[] args) {
		/*Que:
Findout the area of circle pi*r*r by using for loop
where r is coming from Math.random
pi is coming from Math.pi
10 times should executes
		 */
		for(int i=0;i<10;i++)
		{
		double r = Math.random();
		double area = pi*r*r;
		System.out.println(area);
		}

	}

}
