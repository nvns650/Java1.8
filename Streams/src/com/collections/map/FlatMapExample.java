package com.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> chars=Arrays.asList("A","B","C");
		List<String> nums=Arrays.asList("1","2","3");
		List<String> special=Arrays.asList("@","#","&");
		
		List<List<String>> all=new ArrayList<>();
		all.add(chars);
		all.add(nums);
		all.add(special);
		System.out.println(all);
		//before 8
		List<String> allCopy=new ArrayList<String>();
		for(List<String> n: all)
		{
			allCopy.addAll(n);
			
		}
		System.out.println(allCopy);
		
		// flatmap
		
		List<String> flatMapresult=all.stream().flatMap(allInside -> allInside.stream()).collect(Collectors.toList());
		System.out.println(flatMapresult);
	}

}
