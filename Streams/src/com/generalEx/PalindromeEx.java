package com.generalEx;

import java.util.stream.IntStream;

public class PalindromeEx {

	public static void main(String[] args) {
		check(121);
		

	}

	private static void check(int num) {
		Integer s=IntStream.iterate(num, i -> i/10).map(n -> n%10).reduce((a,b) -> a=a*b+b).getAsInt();
		System.out.println(s);
	}

}