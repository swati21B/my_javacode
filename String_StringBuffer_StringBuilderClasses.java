package java_Code;

public class String_StringBuffer_StringBuilderClasses {

	public static void main(String[] args) {
		
		String s1 = "Prisha";
		s1.concat("Baby");
		System.out.println(s1);//hence, string is immutable
		String s2 = s1.concat(" Baby"); //created new object s2
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("Swati");
		s3.append(" Wandhare");
		System.out.println(s3);//hence, StringBuffer is mutable
		
		StringBuilder s4 = new StringBuilder("Teena");
		s4.append(" Bodhale Fullname");
		System.out.println(s4);//hence, StringBuilder is mutable
		System.out.println(s4.replace(6, 13, "give"));
		System.out.println(s4.insert(11, 'M'));
		//System.out.println(s4.delete(6, 10));
		System.out.println(s4.length());
		System.out.println(s4.substring(3));// outputs from 3 onwards
		System.out.println(s4.substring(0, 7));// outputs 0 to 6
		System.out.println("\nchar at index position\n"+s4.charAt(3));
		
		StringBuffer sb = new StringBuffer();
		System.out.println("\ndefault capacity->\n"+sb.capacity());
		// printing the current capacity of the string buffer i.e. 16 + 1
		sb = new StringBuffer("A");
		System.out.println("\nnew capacity->\n"+sb.capacity());
		sb.ensureCapacity(12);
		System.out.println("\nensure new capacity->\n"+sb.capacity());
		

	}

}
