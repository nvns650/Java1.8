package com.constructorRef;

public class TestWithConstuctor {

	public static void main(String[] args) {
		RefInterface ref = () ->
		{
			Sample s= new Sample();
			return s;
		};
		ref.get();
		//Sample i= ref.get();
		RefInterface ref2 = Sample::new;
		ref2.get();
		//Sample sam=ref2.get();

	}

}
