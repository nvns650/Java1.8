package com.OptinalExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NullCheck {
	public static List<String> list= Arrays.asList("India","Australia",null,"","Srilanka");
	
	
		
	public static void main(String[] args) {
	
		/*List<String> stage=list.stream().collect(Collectors.toList());
		System.out.println(stage);
		
		Optional<String> stage2=list.stream().filter(pre -> pre.startsWith("i")).findFirst();
		System.out.println(stage2);*/
	
	System.out.println(getBook("k"));
	}
	
	public static String getBook(String letter) {
		Optional<String> book = list.stream() .filter(b -> b.startsWith(letter)) .findFirst();
		return book.orElse("Not Found"); 
		
		}

	
}
