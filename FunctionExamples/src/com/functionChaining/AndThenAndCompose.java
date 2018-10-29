package com.functionChaining;

import java.util.function.Function;

public class AndThenAndCompose {
	public static void main(String[] args) {
		Function<Integer,Integer> f1 = s -> s+s;
		Function<Integer,Integer> f2 = s -> s*s;
		System.out.println(f1.apply(5));
		System.out.println(f2.apply(5));
		System.out.println(f1.andThen(f2).apply(5));
		System.out.println(f1.compose(f2).apply(5));

	}

}
