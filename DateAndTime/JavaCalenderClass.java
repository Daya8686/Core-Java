package DateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JavaCalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar g= new GregorianCalendar(); //Calender is a interface where GregorianCalender will implement it
		
		System.out.println(g); //we get out of all the methods 
		
		System.out.println(g.getCalendarType());
		System.out.println(g.getFirstDayOfWeek());
		System.out.println(g.getTimeInMillis());
		System.out.println(g.getWeekYear());
		System.out.println(g.isLeapYear(2023));
		System.out.println(g.toZonedDateTime());
		System.out.println(g.get(Calendar.HOUR_OF_DAY));
		System.out.println();
		
		TimeZone t=g.getTimeZone();
		System.out.println(t);
		g.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		System.out.println(g.getTimeZone());
		

	}

}
