package staticExample;

public class Test implements Interf{

	public static void main(String[] args) {
		Test t = new Test();
		/*
		 * t.m1();
		Test.m1(); this two can be valid for normal methods
		*/
		Interf.m1();
		t.m2();
	}

}
