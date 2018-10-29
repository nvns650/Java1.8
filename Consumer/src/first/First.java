package first;

import java.util.function.Consumer;

public class First {

	public static void main(String[] args) {
		Consumer<String> consume = s -> System.out.println(s);
		consume.accept("naveen");
		//consume.accept(1);
		
		Consumer<Integer> consume2 = s -> System.out.println(s);
		consume2.accept(121);
	}

}
