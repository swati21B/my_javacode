package java_Code;

import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
		//create instance of Date class
		Date d1 = new Date();
		//d1.getClass();
		System.out.println("currenty time machine understandable->"+d1.getTime());//getTime return type is long means it gives epoch time machine understandable time
		//we create constructor to get time in human understand form
		
		Date d2 = new Date(d1.getTime());
		System.out.println("\ncurrenty time human understandable->\n"+d2);
		//to apply string functions and just to get date only or time only
		String human= d2.toString();
		String month= human.substring(4, 7);
		System.out.println("\nmonth->"+month);
		String date = human.substring(8, 10);
		System.out.println("\nDate->"+date);
		String year = human.substring(24, 28);
		System.out.println("\nyear->"+year);
		
		Date d3 = new Date(d1.getTime()+(1000*60*60*24*54));//ms*min*sec*hrs*days
		System.out.println("\nFuture time->\n"+d3);
		
		Date d4 = new Date(d1.getTime()-(1000*60*60*24*1));
		System.out.println("\nPast time->\n"+d4);
		
		System.out.println("\nDD/MMM/YYYY format->"+date.concat("/")+month.concat("/")+year);
	}

}
