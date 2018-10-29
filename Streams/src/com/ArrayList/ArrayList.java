package com.ArrayList;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayList {

	public static void main(String[] args) {
		Integer[] st= {5,6,9,2};	
		Stream<Integer> check=Arrays.stream(st);
		check.sorted((a1,a2)->-a1.compareTo(a2)).forEach(s->System.out.println(s));
	}

}
