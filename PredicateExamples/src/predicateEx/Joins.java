package predicateEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class Joins {

	public static void main(String[] args) throws IOException {
		//int x[]= {4,3,6,8,10,7,9,12};
		int x[]= new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("numbes");
		for(int i=0;i<x.length;i++)
		{
			x[i]=br.read();
		}
		
		Predicate<Integer> p1= p -> p>10;
		Predicate<Integer> p2= p -> (p%2)==0;	
		System.out.println("The Numbers Greater Than 10:");
		m1(p1, x);   
		System.out.println("The Even Numbers Are:");  
		m1(p2, x); 
		System.out.println("The Numbers Not Greater Than 10:");  
		m1(p1.negate(), x); 
		System.out.println("The  Numbers Greater Than 10 And Even ");  
		m1(p1.and(p2), x);   
		System.out.println("The Numbers Greater Than 10 OR Even");             
		m1(p1.or(p2), x);   		

	}
	public static void m1(Predicate<Integer> p, int x[])
	{
		for(int x1:x)
		{
			if(p.test(x1))
			{
				System.out.println(x1);
			}
		}
	}

}
