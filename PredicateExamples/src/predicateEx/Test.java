package predicateEx;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		Predicate<Integer> p= (i)  -> i>10;
		System.out.println(p.test(100));
		Predicate<String> p2= (i)  -> i.length()>10;
		System.out.println(p2.test("naveen"));

	}

}
