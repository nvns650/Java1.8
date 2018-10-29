package com.BifuntionExx;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;


public class SalaryInc {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		BiFunction<String, Integer, Employee> fun= (name,sal) -> new Employee(name, sal);
		list.add(fun.apply("naveen",9090));
		list.add(fun.apply("kumar",9899));
		
		BiConsumer<Employee,Double> con = (e,d) ->
		{
			e.setSal(e.getSal()+d);
		};
		for(Employee e : list)
		{
			con.accept(e, (double) 500);
		}
		System.out.println(list);
	}

}
