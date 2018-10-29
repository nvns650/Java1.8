package com.normal;

import java.util.function.Function;

public class First {

	public static void main(String[] args) {
		
		
		Function<Integer,Integer> f2= s -> s*s;
		System.out.println(f2.apply(5));
		
		
		
	}

}
