package com.basicEx;

import java.util.Date;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class DateEx {

	public static void main(String[] args) {
		Supplier<Date> date = () -> new Date();
		System.out.println(date.get());
		/*----------------------------*/
		Supplier<Random> random = () -> new Random();
		int min=1000;
		int max=10000;
		System.out.println(random.get().nextInt((max-min)+1)+min);
		/*----------------------------*/
		Supplier<Integer> s1= () ->	(int)(Math.random()*10);
		System.out.println(s1.get());
		/*----------------------------*/
		IntSupplier s2 = () -> (int)(Math.random()*10);
		String otp="";
		for(int i=0;i<4;i++)
		{
			otp =otp+s2.getAsInt();
		}
		System.out.println(otp);

	}

}
