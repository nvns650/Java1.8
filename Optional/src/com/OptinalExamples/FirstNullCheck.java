package com.OptinalExamples;

import java.util.Optional;

public class FirstNullCheck {

	public static void main(String[] args) {
	FirstNullCheck chek= new FirstNullCheck();
	
	Integer value1= null;
	Integer value2= new Integer(10);
	
	Optional<Integer> cheknull=Optional.ofNullable(value1);
	System.out.println(cheknull);
	Optional<Integer> cheknull2=Optional.ofNullable(value2);
	System.out.println(cheknull2);
	
	/*Optional<Integer> ofCheck1=Optional.of(value1); 
	System.out.println(ofCheck1);*/
	Optional<Integer> ofCheck2=Optional.of(value2);
	System.out.println(ofCheck2);
	
	boolean ispresent1=cheknull.isPresent(); 
	System.out.println(ispresent1);
	boolean ispresent2=ofCheck2.isPresent();
	System.out.println(ispresent2);
	
	Integer num1=cheknull.orElse(new Integer(189));
	System.out.println(num1);
	
	Integer num=ofCheck2.get();
	System.out.println(num);
	}

}