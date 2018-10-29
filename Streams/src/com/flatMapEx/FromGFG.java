package com.flatMapEx;

//Java code for Stream flatMap(Function mapper) 
import java.util.*; 
import java.util.stream.Collectors; 

class FromGFG 
{ 
	// Driver code 
	public static void main(String[] args) 
	{ 
		// Creating a list of Prime Numbers 
		List<Integer> PrimeNumbers = Arrays.asList(96, 97, 111,113); 
		System.out.println(PrimeNumbers.stream().map(m -> (char)m.intValue()).collect(Collectors.toList()));
		
		// Creating a list of Odd Numbers 
		List<String> OddNumbers = Arrays.asList("A","B", "C"); 
		
		// Creating a list of Even Numbers 
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 

		List<List<?>> listOfListofInts = 
				Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 

		System.out.println("The Structure before flattening is : " + 
												listOfListofInts); 
		
		// Using flatMap for transformating and flattening. 
		List<Integer> listofInts = (List<Integer>) listOfListofInts.stream().flatMap(h ->h.stream()).collect(Collectors.toList()); 

		System.out.println("The Structure after flattening is : " + 
														listofInts); 
	} 
} 
