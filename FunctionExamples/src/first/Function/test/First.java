package first.Function.test;

import java.util.function.Function;

public class First {

	public static void main(String[] args) {
		Function<String,Integer> f= s -> s.length();
		System.out.println(f.apply("Naveen"));
		
		Function<Integer,Integer> f2= s -> s*s;
		System.out.println(f2.apply(5));
		
		Function<String,Boolean> f3= s -> s.length() >5;
		System.out.println(f3.apply("Nave"));
		
	}

}
