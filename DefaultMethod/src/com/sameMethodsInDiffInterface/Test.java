package com.sameMethodsInDiffInterface;

public class Test implements One, Two {

	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		
	}

	
	public void m1() {
		
		One.super.m1();
		Two.super.m1();
		//if in One Interface public it wont work 
		
	}

	
}
