package com.usginAllFun;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Verify {
	public static void main(String[] args) {
		ArrayList<StudentPojo> list= new ArrayList<>();
		list.add(new StudentPojo("naveen", 78));
		list.add(new StudentPojo("kiran", 90));
	
	Predicate<StudentPojo> predicate = p -> p.getMarks()>70;	
	Function<StudentPojo,String> fun = f -> {
		int mark = f.getMarks();
		if(mark>80)
		{
			return "A";
		}
		else if(mark>70)
		{
			return "B";
		}
		else
			return "D";
	};
	/*Consumer<StudentPojo> con = c -> { 
		System.out.println(c.getName()); 	
		System.out.println(fun.apply(c));  
		};*/
		Consumer<StudentPojo> con=s->{
			 System.out.println("Student Name:"+s.getName());
			  System.out.println("Student Grade:"+fun.apply(s));
			 System.out.println();
			 };
	
	for(StudentPojo s : list)
	{
		if(predicate.test(s))
		{
			con.accept(s);
		}
	}
}		
}

			



