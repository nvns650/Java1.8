package com.unaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class BinaryVsNormal {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> f1= (i,j) -> i+j;
		System.out.println(f1.apply(5,4));
		
		BinaryOperator<Integer> f2= (i,j)->i*j;
		System.out.println(f2.apply(6,6));
		
		IntBinaryOperator f3=  (i,j)->i/j;
		System.out.println(f3.applyAsInt(100,10));
		
		
		
	}

}
