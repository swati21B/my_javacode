package newpackage;

import java.util.Scanner;

public class ScannerClassEx2 {
	
	
	public static void main(String[] args) {
	
        Scanner O1 = new Scanner(System.in);
        
        		//area of circle
           		System.out.println("Enter the radius of circle: ");
           		int	r = O1.nextInt();    
           		double area = Math.PI * r * r;
    	        System.out.println("The area of the circle: "+area); 
    	        
    	        //circumference of the circle
    	        System.out.println("Enter the radius of circle: ");
           		int	rad = O1.nextInt();    
           		double circumference = 2*Math.PI * rad;
    	        System.out.println("The circumference of the circle: "+circumference);  
    	        
    	        //area of square
    	        System.out.println("Enter the side of square: ");
    	        int side =O1.nextInt();
    	        int areaofsq = side*side;
    	        System.out.println("The area of the square: "+areaofsq);  
    	        
    	      //circumference of the square
    	        System.out.println("Enter the side of square: ");
    	        int s1 =O1.nextInt();
    	        int circumferenceofsq = 4*s1;
    	        System.out.println("The circumference of the square: "+circumferenceofsq);  
    	        
    	      //area of rectangle
    	       System.out.println("enter length of rectangle");
    	       float length = O1.nextFloat();
    	       System.out.println("enter width of rectangle");
    	       float width = O1.nextFloat();
    	       double areaofrectangle = length * width;
    	       System.out.println("The area of the rectangle: "+areaofrectangle);  
    	       
    	     //circumference of the rectangle 2(length+width)
    	       System.out.println("enter length of rectangle");
    	       float l1 = O1.nextFloat();
    	       System.out.println("enter width of rectangle");
    	       float w1 = O1.nextFloat();
    	       double perimeterofrectangle = (l1 + w1) * 2;
    	       System.out.println("The perimeter of the rectangle: "+perimeterofrectangle);  
    	       
    	       
    	        //are of triangle =1/2 of base * height
    	       
    	       System.out.println("enter base of triangle");
    	       float base = O1.nextFloat();
    	       System.out.println("enter height of triangle");
    	       float height = O1.nextFloat();
    	       double areaoftriangle = base * height / 2;
    	       System.out.println("The area of triangle is: " +areaoftriangle);
    	       
    	     //circumference of the triangle
    	       System.out.println("enter side1 of triangle");
    	       int si1 = O1.nextInt();
    	       System.out.println("enter side2 of triangle");
    	       int si2 = O1.nextInt();
    	       System.out.println("enter side3 of triangle");
    	       int si3 = O1.nextInt();
    	       int circumferenceoftriangle = si1 + si2 + si3;
    	       System.out.println("The circumference of triangle is: " +circumferenceoftriangle);
    	       
    	       //area of trapezium =1/2 (a+b) * h (a+b is sum of parallel sides)
    	       System.out.println("enter side1 of trapezium");
    	       int side1 = O1.nextInt();
    	       System.out.println("enter side2 of trapezium");
    	       int side2 = O1.nextInt();
    	       System.out.println("enter height1 of trapezium");
    	       int height1 = O1.nextInt();
    	       int areaoftrapezium = (side1 + side2) * height1 / 2;
    	       System.out.println("The are of trapezium is: " +areaoftrapezium);
    	       
    	     //circumference of the trapezium =AB + BC + CD + AD (sum of all sides)
    	       
    	       System.out.println("enter sideAB of trapezium");
    	       int sideAB = O1.nextInt();
    	       System.out.println("enter sideBC of trapezium");
    	       int sideBC = O1.nextInt();
    	       System.out.println("enter sideCD of trapezium");
    	       int sideCD = O1.nextInt();
    	       System.out.println("enter sideAD of trapezium");
    	       int sideAD = O1.nextInt();
    	       int circumferenceoftrapezium = sideAB +sideBC + sideCD + sideAD;
    	       System.out.println("The circumference of trapezium is: " +circumferenceoftrapezium);
    	       
    	       O1.close();    	        
    	        
    	        
	}

}
