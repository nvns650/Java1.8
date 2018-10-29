package com.methodRefEx;

public class ThreadExampleNormalAndLE {

public static void main(String[] args) throws InterruptedException {
	/*Nornal Runnable impl*/
Runnable r1= new Runnable() {
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Main");
		}
		
	}};
Thread t1= new Thread(r1);
t1.start();
for(int i=0;i<5;i++)
{
	System.out.println("Child");
}
 /*LE Runnable impl*/
Runnable r2= () -> {

		for(int i=0;i<5;i++)
		{
			System.out.println("LE main");
		}
		
	};
Thread t2= new Thread(r2);
t2.start();
for(int i=0;i<5;i++)
{
	System.out.println("LE Child");
	
}
}
/*MR Runnable impl*/

}
