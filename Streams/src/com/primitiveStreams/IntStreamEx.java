package com.primitiveStreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {

	public static void main(String[] args) {
		int[] numbers= new int[] {1,2,3,4,5};
		int[] numbers2= new int[] {};
		int min=IntStream.of(numbers).sum(); //sum() min() max() average()
		System.out.println(min);
		OptionalDouble avg=IntStream.of(numbers).average();
		System.out.println(avg.getAsDouble());
		//null check
		OptionalDouble avg2=IntStream.of(numbers2).average();
		System.out.println(avg2);
		//sum of 10 numbers
		int sumof= IntStream.range(1, 10).sum();
		System.out.println(sumof);
		int sumof2= IntStream.rangeClosed(1, 10).filter(i -> i%5==0).sum();
		System.out.println(sumof2);
		System.out.println("flatMap");
		Stream.of(1, 2, 3)
		
		//.map(n -> Stream.of(n, n+1)) doesn't works
	    .flatMap(n -> Stream.of(n, n+1))
	    .forEach(System.out::println);
		
		Stream<String> in=Stream.of("1","9","4");
		Optional<String> id=in.collect(Collectors.minBy(Comparator.naturalOrder())); //maxBy
		System.out.println(id.get());
		
	}

}
