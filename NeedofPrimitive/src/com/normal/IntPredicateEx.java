package com.normal;

import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntPredicateEx {

	public static void main(String[] args) {
		int[] x= {1,3,5,3,4,6,78,0};
		IntPredicate p = i -> i%2==0;
		for(int x1:x)
		{
			if(p.test(x1))
			{
				System.out.println(x1);
			}
		}
		
		///IntToDoubleFunction f2= i -> i*i;
		//System.out.println(f2.applyAsDouble(5)));
		
		ToIntFunction<Integer> f1= i -> i*i;
		System.out.println(f1.applyAsInt(5));
		
		
		
	}

}
