package com.splIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class First {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	//List<Integer> list2=new ArrayList<>();
	list.add(3);
	list.add(2);
	list.add(1);
	Spliterator<Integer> spl=list.stream().spliterator();
	//Spliterator<Integer> spl2=list.spliterator();
	System.out.println("estSize"+spl.estimateSize());
	System.out.println("exaact"+spl.getExactSizeIfKnown());
	System.out.println(spl.hasCharacteristics(spl.characteristics()));
	spl.forEachRemaining(k -> System.out.println(k+1));
	 //while(spl.tryAdvance((u) -> System.out.println(u)));
	// while(spl.tryAdvance((u) -> list.add(u)));
	// System.out.println(list2);
	 
	 spl=list.stream().spliterator();
	 Spliterator<Integer> spl3=spl.trySplit();
	 if(spl3!=null)
	 spl3.forEachRemaining((n) -> System.out.println("split-1="+n));
	 spl.forEachRemaining((n) -> System.out.println("split-2="+n));
		 
	 
	}

}
