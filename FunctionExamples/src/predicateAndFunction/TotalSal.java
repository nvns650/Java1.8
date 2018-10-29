package predicateAndFunction;

import java.util.ArrayList;
import java.util.function.Function;

public class TotalSal {

	public static void main(String[] args) {
		ArrayList<StudentPojo> list = new ArrayList<StudentPojo>();
		dumplist(list);
		
		Function<ArrayList<StudentPojo>,Double> f2= s->{   
			Double tot=(double) 0;
			for(StudentPojo l : s)
			{
				tot= tot+l.getMarks();
			}
			return tot;
		};
		System.out.println(f2.apply(list));
		
		
	}
	

	private static void dumplist(ArrayList<StudentPojo> list) {
		list.add(new StudentPojo("naveen", 78));
		list.add(new StudentPojo("kiran", 90));
		list.add(new StudentPojo("naveen", 79));
		list.add(new StudentPojo("harish", 91));
		
	}
	
}
