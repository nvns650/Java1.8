package com.functionChaining;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Authentication {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("name");
	String name=sc.next();
	System.out.println("password");
	String passwod=sc.next();
	Predicate<String> pred = p -> p.length()>5;
	Function<String,String>  f1= s-> s.substring(0, 5);
	Function<String,String>  f2= s-> s.toLowerCase();
	if(pred.test(name))
	{
		
	
	if(f1.andThen(f2).apply(name).equals("navee") && passwod.equals("java"))
	{
		System.out.println("ok");
	}
	else
		System.out.println("not ok");
		
	}
	else
		System.out.println("length < 5");
	}
}
