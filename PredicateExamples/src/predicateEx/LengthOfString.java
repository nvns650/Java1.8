package predicateEx;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
	Predicate<String> lengthTest= s -> s.length()>10;
	System.out.println(lengthTest.test("NaveenKumar"));
	System.out.println(lengthTest.test("Naveen"));
	System.out.println(lengthTest.test(""));

	}

}
