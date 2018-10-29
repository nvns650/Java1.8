package com.splIterator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSkipLimit {

	static List<String> list=Arrays.asList("A","B","C","B");

	private void testDisctinct() {
		
	list.stream().distinct().forEach(s -> System.out.println(s));	
		}
	
	private void skipTest() {
		System.out.println(list.stream().skip(1).collect(Collectors.joining("-")));
		
	}
	private void limitTest() {
		
		System.out.println(list.stream().limit(1).collect(Collectors.joining("-")));
	}
	
	public static void main(String[] args) {
	
	new DistinctSkipLimit().testDisctinct();
	System.out.println(list);
	DistinctSkipLimit l= new DistinctSkipLimit();
	l.skipTest();
	l.limitTest();
	
	}

	


	

	

}
