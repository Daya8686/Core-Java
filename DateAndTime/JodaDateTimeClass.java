package DateAndTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class JodaDateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//There we do not use new key word ad we have used in Date class
		//This also started from 01-01-1970 with Seconds + nano seconds
		//For Date we use LocalDate and for time we use LocalTime
		//Joda DateTime -> LocalDate, LocalTime, LocalDateTime we dont have ZoneID in JodaDate for that we need to use ZonedDateTime
		
		LocalDate l=LocalDate.now();
		System.out.println(l);
		//This is immutalble
		LocalDate l1=LocalDate.now(Clock.systemDefaultZone());
		System.out.println(l1);
		LocalDate l2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(l2);
		LocalDate l3=LocalDate.MAX;
		System.out.println(l3);
		LocalDate l4=LocalDate.of(2023, 11, 01);
		System.out.println(l4);
		LocalDate l5=LocalDate.of(2023, Month.DECEMBER, 01);
		System.out.println(l5);
		l5.plusYears(2); //this will not change because these LocalDate and LocalTime are Immutable
		System.out.println(l5);
		LocalDate l6=l5.plusYears(2); //after this change if we write again any thing then that will be overwritten
		System.out.println(l6);
		l6=l5.plusMonths(10);
		System.out.println(l6);
		l6=l5.minusYears(5);
		System.out.println(l6);
		
		//Now LocalTime
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		LocalTime t=LocalTime.NOON;
		System.out.println(t);
		LocalTime t1=LocalTime.MAX;
		System.out.println(t1);
		t1=LocalTime.MIN;
		System.out.println(t1);
		LocalTime t2=LocalTime.of(23, 34, 56);
		System.out.println(t2);
		//all methods are same in LocalDate and LocalTime
		
		
		//Now LocalDateTime
		
		LocalDateTime dt=LocalDateTime.of(2023, 07, 03, 8, 46);
		System.out.println(dt);
		LocalDateTime dt1=LocalDateTime.of(l6,  t);
		System.out.println(dt1);

	}

}
