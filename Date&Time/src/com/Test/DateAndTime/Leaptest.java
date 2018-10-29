package com.Test.DateAndTime;

import java.time.Year;
import java.util.Scanner;

public class Leaptest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int year=sc.nextInt();
		Year y=Year.of(year);
		if(y.isLeap())
		{
			System.out.println("leap");
		}
		else
		System.out.println("Not leap");
	}

}
