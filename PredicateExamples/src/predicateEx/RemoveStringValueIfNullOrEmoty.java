package predicateEx;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveStringValueIfNullOrEmoty {

	public static void main(String[] args) {
		String values[]= {"A","",null,"B"};
		
		ArrayList<String> list= new ArrayList<>();
		ArrayList<String> list2= new ArrayList<>();
		Predicate<String> p = s -> s!=null && s.length()!=0;
		for(String check : values)
		{
			if(p.test(check))
			{
				list.add(check);
			}
		}
		System.out.println(list);
		// normal wont work
		for(String check : values)
		{
			System.out.println(check);
			//if(check!="" && check.isEmpty()) not working NPE .equals(for content check only) also
			if(check!="" && check!=null) 
			{
				list2.add(check);
			}
		}
		System.out.println(list2);

	}

}
