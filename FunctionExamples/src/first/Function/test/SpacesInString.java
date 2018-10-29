package first.Function.test;

import java.util.function.Function;

public class SpacesInString {

	public static void main(String[] args) {
		String str="hai welcome to Pune";
		Function<String, String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply(str));
		
		Function<String, Integer> f2 = s ->( s.length() - s.replaceAll(" ", "").length());
		System.out.println(f2.apply(str));
		
	
	}

}
