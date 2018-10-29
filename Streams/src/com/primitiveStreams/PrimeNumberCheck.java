package com.primitiveStreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberCheck {
	//A stream cannot be reused after calling a terminal operation.

	//To perform a computation on the same elements from the same data source, we have to recreate the stream pipeline.
	public static void main(String[] args) {
		int a[]=new int[] {1,3,4,7,8,9,23,11,99};
		checkPrime(9);
	//	checkPrime2(a);
		
	}

	/*private static void checkPrime2(int[] a) {
		IntStream s= Arrays.stream(a);
	System.out.println(IntStream.range(2, a.length).anyMatch(i -> s%i==0));
		
	}*/

	private static void checkPrime(int num) {
		System.out.println(!IntStream.range(2, num/2).anyMatch(i -> num%i==0));
	}

}
