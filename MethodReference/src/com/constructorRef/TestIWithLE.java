package com.constructorRef;

public class TestIWithLE {

	public static void main(String[] args) {
		RefInterface ref = () ->
		{
			Sample s= new Sample();
			return s;
		};
		Sample i= ref.get();
		

	}

}
