package com.Test.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class AgeCal {

	public static void main(String[] args) {
		LocalDate Bday=LocalDate.of(1994, 9, 30);
		LocalDate today=LocalDate.now();
		Period p=Period.between(Bday, today);
		System.out.println(p.getYears()+"years"+p.getMonths()+"months"+p.getDays());
		System.out.println("number of days="+p.getYears()*365+p.getMonths()*30+p.getDays());
		
	
	}

}
