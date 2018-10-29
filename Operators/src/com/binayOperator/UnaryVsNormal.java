package com.binayOperator;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryVsNormal {

	public static void main(String[] args) {
		Function<Integer,Integer> f1= i -> i*i;
		System.out.println(f1.apply(10));
		
		UnaryOperator<Integer> f2= i->i*i;
		System.out.println(f2.apply(100));
		
		IntUnaryOperator f3=  i->i*i;
		System.out.println(f3.applyAsInt(1000));
		
		System.out.println(f1.andThen(f2).apply(5)); 
		//System.out.println(f1.andThen(f3).apply(5)); not possible
		
	}

}
