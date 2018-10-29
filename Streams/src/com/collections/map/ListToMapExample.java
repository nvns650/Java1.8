package com.collections.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMapExample {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("Naveen", 24, 17000));
		list.add(new Student("kiran",22 ,15000));
		list.add(new Student("harish",22,45000 ));
		list.add(new Student("Naveen", 26, 99000));
		Map<String,Integer> li=list.stream().collect(
				Collectors.toMap(Student::getName,Student::getAge,(oldValue,newValue)->newValue,HashMap::new));
		System.out.println(li);
		
				
		Map<String,Integer> li2=list.stream().collect(
				Collectors.toMap(Student::getName,Student::getAge,(oldValue,newValue)->oldValue));
		System.out.println(li2);
		
		Map<String,Integer> li3=list.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).collect(
				Collectors.toMap(Student::getName,Student::getAge,(oldValue,newValue)->newValue));
		System.out.println(li3);
		
			
	}

}
