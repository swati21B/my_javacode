package java_Code;

import java.util.Arrays;
import java.util.Scanner;

public class AreaofRectangle_Test {

	public static void main(String[] args) {
		 Scanner o1 = new Scanner(System.in);
		 float side[]=new float[4];
		 System.out.println("enter length of rectangle");
		 side[0] = o1.nextFloat();
		 side[1] = o1.nextFloat();
		float length = side[0]+side[1];
		 System.out.println("enter width of rectangle");
		 side[2] = o1.nextFloat();
		 side[3] = o1.nextFloat();
		float width =side[2]+side[3];
		 float Area = length*width;
		   System.out.println("The area of the rectangle: "+Area);  

	}

}
