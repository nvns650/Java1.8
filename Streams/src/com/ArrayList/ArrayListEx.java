package com.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(9);
		al.add(7);
		al.add(3);
		al.add(9);
		al.add(5);
		al.add(6);
		al.add(1);
		System.out.println(al);
		ArrayList<Integer> alCopy = new ArrayList<Integer>();
		/*normal*/
		System.out.println("normal");
		for (Integer number : al) {
			if (number % 2 == 0) {
				alCopy.add(number);
			}
		}
		
		System.out.println(alCopy);
		/*Stream */
		System.out.println("forEach");
		al.stream().forEach(s -> System.out.print(s+"\t"));
		/*Stream with filter collect*/
		al.stream().filter(i -> i%2==0).forEach(s -> System.out.println(s));
		//collect
		List<Integer> list=al.stream().filter(i -> i>3).collect(Collectors.toList());
		System.out.println(list);
	
		//map
		System.out.println(al.stream().map(i -> i*10).filter(p -> p%20==0).collect(Collectors.toList()));
		//count
		System.out.println(al.stream().map(i -> i*10).filter(p -> p%20==0).count());
		//sorted
		System.out.println(al.stream().sorted().collect(Collectors.toSet()));
		System.out.println(al.stream().sorted((a1,a2)-> -a1.compareTo(a2)).collect(Collectors.toList()));
		//max min
		System.out.println(al.stream().min((a1,a2) -> a1.compareTo(a2)).get());
		System.out.println(al.stream().max((a1,a2) -> a1.compareTo(a2)).get());
		System.out.println(al.stream().min((a1,a2) -> -a1.compareTo(a2)).get());
		al.stream().forEach(s -> System.out.println(s));
		al.stream().forEach(System.out::println);
		System.out.println("------------------");
		//toArray
		Integer[] i= al.stream().toArray(Integer[]::new);
		al.stream().forEach(s -> System.out.println(s));
		//Stream.of
		Stream<Integer> s= Stream.of(1,22,22,33,4444,555);
		s.forEach(k->System.out.println(k));
	
		Integer[] y = {111,222,333,444};
		Stream<Integer> s2= Stream.of(y);
		s2.forEach(p->System.out.println(p));
		
		
		
	}

}
