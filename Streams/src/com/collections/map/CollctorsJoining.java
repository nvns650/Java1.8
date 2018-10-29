package com.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollctorsJoining {

	public static void main(String[] args) {
		//Normal list
		List<String> names=Arrays.asList("A","B","C");
		String res=names.stream().collect(Collectors.joining());
		System.out.println(res);
		
		res=names.stream().collect(Collectors.joining("-"));
		System.out.println(res);
		
		res=names.stream().collect(Collectors.joining("-","Preffix > "," < Suffix"));
		System.out.println(res);
		
		//List Object
		List<Student> list=new ArrayList<>();
		list.add(new Student("Naveen", 24, 17000));
		list.add(new Student("kiran",22 ,15000));
		list.add(new Student("harish",22,45000 ));
		list.add(new Student("Naveen", 26, 99000));
		System.out.println(list);
		String s=list.stream().map(k-> k.getName()).collect(Collectors.joining("-"));
		System.out.println(s);
		
	}

}
