package first.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ForLoop {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("one","two","three");
		for(int i=0;i<list.size();i++) //normal
		{
			System.out.println(list.get(i));
		}
		for(String s : list) // java 5
		{
			System.out.println(s);
		}
		list.stream().forEach(s -> System.out.println(s)); // 8
	}

}
