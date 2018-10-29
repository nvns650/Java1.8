package predicateEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class isEmptyEx {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Predicate<ArrayList> check = s -> s.isEmpty();
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		System.out.println(check.test(list));
		
		ArrayList<String> list2= new ArrayList<String>();
		Predicate<Collection> check2 = s -> s.isEmpty();
		System.out.println(check2.test(list2));

	}

}
