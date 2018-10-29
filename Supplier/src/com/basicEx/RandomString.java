package com.basicEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomString {

	public static void main(String[] args) {
		
		Supplier<String> su =() ->
		{
			String[] s= {"A","B","C","D"};
			int x= (int) (Math.random()*4);
			return s[x];
			
		};
		System.out.println(su.get());
		System.out.println(su.get());
		System.out.println(su.get());
	}

}
