package com.Test.DateAndTime;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTimeInMillis());
		System.out.println(c.getWeekYear());
		System.out.println(c.getFirstDayOfWeek());

	}

}
