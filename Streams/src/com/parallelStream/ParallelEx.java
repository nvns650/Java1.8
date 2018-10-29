package com.parallelStream;

import java.util.ArrayList;
import java.util.List;

import com.collections.map.Student;

public class ParallelEx {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		for(int i=0;i<100;i++)
		{
		list.add(new Student("Naveen", 24, 17000));
		list.add(new Student("kiran",22 ,15000));
		list.add(new Student("harish",22,45000 ));
		list.add(new Student("Naveen", 26, 99000));
		}

	}

}










