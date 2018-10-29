package defaultCheck;

public class Min implements One{
	public void m1(int a,int b)
	{
		One.super.m1();
		System.out.println("sum="+(a+b));
	}

	public static void main(String[] args) {
		Min min= new Min();
		min.m1(1,2);
		
		//One.super.m1();
		// One.m1(); it will work if interface method is static
	}

}
