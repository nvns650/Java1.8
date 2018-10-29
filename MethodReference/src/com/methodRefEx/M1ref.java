package com.methodRefEx;

public class M1ref {

	public static void m2() {
		System.out.println("impl of m1 in m2");
	}
	public static void main(String[] args) {
		RefInterface ref = M1ref::m2;
		ref.m1();

	}

}
