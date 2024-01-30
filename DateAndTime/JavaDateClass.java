package DateAndTime;

import java.util.*;
public class JavaDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getHours());

		Date d1=new Date("10/28/2024");
		System.out.println(d1);
		Date d2=new Date();
		System.out.println(d1.getDay()); //this date class is debricated
		System.out.println(d.compareTo(d2));
		System.out.println(d2);
		
	}

}
