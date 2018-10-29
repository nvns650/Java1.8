package predicateAndFunction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGradeCheck {

	public static void main(String[] args) {
		ArrayList<StudentPojo> list = new ArrayList<>();
		populate(list);
		Predicate<StudentPojo> maks = s -> s.getMarks()>80;
		 Function<StudentPojo,String> f2= s->{         
			 int marks=s.getMarks();   
			
			 
			 if(marks>=80)          
			 {                
				 return "A[Dictinction]";       
			 }
			 if(marks>=70)          
			 {                
				 return "B[Dictinction]";       
			 }
			 else
				 return "Fail";
			 
		 };
		for(StudentPojo s : list)
		{
			if(maks.test(s))
			{
			System.out.println(s.getName());
			System.out.println(f2.apply(s));
			}
		}
	
	
	}
	

	private static void populate(ArrayList<StudentPojo> list) {
		list.add(new StudentPojo("naveen", 78));
		list.add(new StudentPojo("kiran", 90));
		
		
	}

}
