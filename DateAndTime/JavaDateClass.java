package DateAndTime;

import java.util.*;
public class JavaDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getHours());

		Date d1=new Date("10/28/2020");
		System.out.println(d1);
		System.out.println(d1.getDay()); //this date class is debricated
		
	}

}
