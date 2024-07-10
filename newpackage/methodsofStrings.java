package newpackage;

public class methodsofStrings {
	static void mystring()
	{
		String name=" School name is vidya";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.substring(3));// gives output start index from 3
		System.out.println(name.substring(0,7)); //gives output for mentioned indexes
		String name2 ="Prisha";
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(" SCHOOL NAME IS VIDYA"));
		System.out.println(name2.contains("isha"));
		System.out.println(name.contains("is"));
		String name3 ="";
		System.out.println("check whether given string is empty " +name3.isEmpty());
		System.out.println("Last index of char a " +name.lastIndexOf('a'));
		System.out.println(name.replace('a', 'g'));
		System.out.println(name2.replaceAll(name2, "oshan"));
		//In the given string remove all the numbers
		String school = "VMVschool12345";
		System.out.println(school.replaceAll("[0-9]", ""));
		//In the given string remove all the lowercase letters
		System.out.println(school.replaceAll("[a-z]", ""));
		//In the given string replace all the capital letters
		System.out.println(school.replaceAll("[A-Z]", ""));
		//check if given string ends with a
		System.out.println(name.matches("(.*)a"));
		//check if given string starts with P
		System.out.println(name2.matches("P(.*)"));
		//check if given string letter i is present or not
		System.out.println(name2.matches("(.*)i(.*)"));
		//check if given string is of 6 chars
		System.out.println(name2.matches("......"));
		
		
	}

	public static void main(String[] args) {
		mystring();

	}

}
