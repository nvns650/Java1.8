package com.BifuntionExx;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFuntionEx {

	public static void main(String[] args) {
		ArrayList<StudentPojo> list = new ArrayList<>();
		BiFunction<String, Integer, StudentPojo> fun= (name,marks) -> new StudentPojo(name, marks);
		list.add(fun.apply("naveen",79));
		list.add(fun.apply("kumar",89));
		System.out.println(list);

	}

}
