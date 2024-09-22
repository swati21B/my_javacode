package java_Code;

import package1.OutsidethepackageParent;

public class Outsidethepackage_bybecomingsubclass extends OutsidethepackageParent{

	public static void main(String[] args) {
		Outsidethepackage_bybecomingsubclass o1 = new Outsidethepackage_bybecomingsubclass();
		test1(); //public method
		//o1.test2(); //private method cannot access
		o1.test3();//protected method
		//o1.test4();//default method

	}

}
