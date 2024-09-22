package package1;

public class outsidethepackagewithoutbecomingsubclassParent {
	public static void test1() {
		System.out.println("I am public method");
	}
	private void test2() {
		System.out.println("I am private method");
	}
	protected void test3() {
		System.out.println("I am protected method");
	}
	void test4() {
		System.out.println("I am default method");
	}

}
