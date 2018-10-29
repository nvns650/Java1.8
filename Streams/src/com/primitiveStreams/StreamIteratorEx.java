package com.primitiveStreams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIteratorEx {

	public static void main(String[] args) {
		Stream<Long> str= Stream.iterate(1L, n -> n+1).limit(10);
		str.forEach(s -> System.out.println(s));

		
		Stream.iterate(1L, n -> n+1).filter(StreamIteratorEx::check).skip(10).limit(5).forEach(s -> System.out.println(s));
	// five zero's/1
		IntStream.generate(() -> 1).limit(5).forEach(s -> System.out.println(s));
	//Random generate
		IntStream.generate(new Random()::nextInt).limit(5).forEach(s -> System.out.println(s));
	
	}
	public static boolean check(long number)
	{
		if (number % 2 == 0) {
		      return false;
		    }
		    return true;
		
	}
}
