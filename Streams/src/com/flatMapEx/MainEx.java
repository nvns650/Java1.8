package com.flatMapEx;

import java.util.ArrayList;
import java.util.List;

public class MainEx {

	public static void main(String[] args) {
		List<Address> addList=new ArrayList<>();
		addList.add(new Address("1-1", "hyderabad"));
		addList.add(new Address("2-1", "kerala"));
		addList.add(new Address("3-1", "andhra"));
		
		List<State> addState= new ArrayList<>();
		addState.add(new State("Hyd"));
		addState.add(new State("Amaravathi"));
		
		
		List<Object> student=new ArrayList<>();
		student.add(addList);
		student.add(addState);
		System.out.println(student);
		for(Object s : student)
		{
			System.out.println(s);
		}
		
		//student.stream().flatMap(m -> m.get)).C
		
	}

}



		
		