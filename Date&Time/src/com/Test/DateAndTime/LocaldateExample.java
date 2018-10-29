package com.Test.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class LocaldateExample {

	public static void main(String[] args) {
		System.out.println("-----------date---------");
		Date d= new Date();
		System.out.println(d);
		System.out.println(d.getDay());
		d.getHours();
	
		
		System.out.println("-----------calendar---------");
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.getTimeZone());
		System.out.println(c.getWeekYear());
		c.getFirstDayOfWeek();
		
		
		System.out.println("-----------LocalDate---------");
	LocalDate date=LocalDate.now();
	System.out.println(date);
	//date.parse("2016-01-08");
	System.out.println(date);
	System.out.println(date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear());
	System.out.println("day of year="+date.getDayOfYear()+""+date.getEra());
	System.out.println(date.isLeapYear());
	
	
	System.out.println("-----------LocalTate---------");
	LocalTime time=LocalTime.now();
	System.out.println(time);
	System.out.println(time.getHour()+"-"+time.getMinute()+"-"+time.getSecond()+"-"+time.getNano());
	
	System.out.println("-----------LocalDateTime---------");
	LocalDateTime dt=LocalDateTime.now();
	System.out.println(dt);
	//dt.parse("2016-01-08");
	System.out.println(dt);
	
	LocalDateTime dt2= LocalDateTime.of(2010, 10,10, 9,10,56,9373);
	System.out.println("particular date="+dt2);
	System.out.println("after 3 months="+dt.plusMonths(3));
	System.out.println("before 3 months="+dt.minusMonths(3));
	// to change current date time in date or time
	System.out.println(dt.withDayOfMonth(12));
	System.out.println(dt.withHour(22));
	
	
	//Zone present
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
	//ZoneId other zone
	ZoneId zoneO=ZoneId.of("America/Los_Angeles");
	ZonedDateTime z=ZonedDateTime.now(zoneO);
	System.out.println(z);
	}

}
