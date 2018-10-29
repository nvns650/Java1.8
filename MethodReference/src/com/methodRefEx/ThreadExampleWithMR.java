package com.methodRefEx;

public class ThreadExampleWithMR {
	public void m2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("LE main");
		}
	}
	public static void main(String ar[])
	{
	ThreadExampleWithMR threadExampleWithMR = new ThreadExampleWithMR();
	Runnable r = threadExampleWithMR::m2;
	Thread t = new Thread(r);
	t.start();
	for(int i = 0;i<5;i++)
	{
		System.out.println("LE Child");

	}
}
}
