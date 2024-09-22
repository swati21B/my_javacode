package java_Code;

public class Ex2_AsserKeyword {

	public static void main(String[] args) {
	
		int weight = 20;
		assert weight>25: "Sorry you are Underweight";
		//by-default assert is disabled, and once we enable it, it remains enable for the class
		System.out.println("Value is->"+weight);
	}

}
