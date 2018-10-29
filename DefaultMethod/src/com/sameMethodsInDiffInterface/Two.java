package com.sameMethodsInDiffInterface;

public interface Two {
	default void m1() {
		System.out.println("two");
		}
}
