package com.basicEx;

import java.util.Random;
import java.util.function.Supplier;

public class RandomOtp {

	public static void main(String[] args) {
		long start=(int) System.currentTimeMillis();
		Supplier<String> su = () ->
		{
			String num="";
			for(int i=0;i<4;i++)
			{
				num=num+(int)(Math.random()*10);
			}
			return num;
			
		};
		
		long end=(int) System.currentTimeMillis();
		System.out.println(su.get());
		System.out.println("--time diff "+(end-start));
		long start1=(int) System.currentTimeMillis();
		Supplier<String> s2 = () ->
		{
		Random s= new Random();
		String num="";
		for(int i=0;i<4;i++)
		{
			
			num=num+s.nextInt(10);
		}
		return num;
		};
		
		System.out.println(su.get());
		long end1=(int) System.currentTimeMillis();
		System.out.println("--time diff "+(end1-start1));
		

	}

}
