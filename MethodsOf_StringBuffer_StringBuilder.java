package java_Code;

public class MethodsOf_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		//constructor 1
		StringBuffer SB =new StringBuffer();
		SB.insert(0, 'C');
		System.out.println(SB);
		
		StringBuffer SB1 =new StringBuffer("Prisha");
		SB1.append(" Prasad");
		System.out.println(SB1);
		System.out.println(SB1.capacity());
//output is the length of characters +16 initial capacity of the string buffer
		System.out.println(SB1.charAt(8));
		System.out.println(SB1.indexOf("Prasad"));//outputs index of P
		System.out.println(SB1.lastIndexOf("Prisha"));//outputs index of P
		System.out.println(SB1.lastIndexOf("Prisha", 8));
		System.out.println(SB1.insert(0, "Dear"));
		System.out.println(SB1.reverse());
		StringBuffer SB2 =new StringBuffer("Prisha");
		//why always returns false
		System.out.println(SB2.equals(SB1));
		System.out.println(SB2.replace(0, 3, "a"));
		
		
		
		

	}

}
