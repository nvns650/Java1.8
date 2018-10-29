package com.StringJoin;

import java.util.ArrayList;
import java.util.UUID;



public class JoiningtwoSringsAndList {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("naveen");
		list.add("Kiran");
		String s1=new String( "Hai");
		String s2= "Hello";
		String s3= null;
		System.out.println(String.join("-", s1,s2,s3));
		System.out.println(String.join("-", list));
		System.out.println(UUID.randomUUID());

	}

}
