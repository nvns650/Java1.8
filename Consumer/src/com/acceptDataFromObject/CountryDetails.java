package com.acceptDataFromObject;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class CountryDetails {

	public static void main(String[] args) {
		int start1=(int) System.currentTimeMillis();
		ArrayList<Country> list= new ArrayList<>();
		list.add(new Country("India", "rupee"));
		list.add(new Country("USA","dollar" ));
		Consumer<Country> con = c -> {
			System.out.println(c.getName()+" "+c.getCurrency());		
		};
		for(Country country : list)
		{
			con.accept(country);
		}
		int end1=(int) System.currentTimeMillis();
		System.out.println("completed In="+(end1-start1)+" MilliSec");
		int start2=(int) System.currentTimeMillis();
		ArrayList<Student> list2= new ArrayList<Student>();
		list2.add(new Student("India", 2000));
		list2.add(new Student("USA",3000));
		IntConsumer cc = ( i) -> System.out.println(i*i);
		cc.accept(5);
		ObjIntConsumer<Student> consumer = (e,sal) ->
		{
			e.setSal(e.getSal()+sal);
		};
		for(Student s :list2)
		{
			consumer.accept(s, 500);
		}
		for(Student s :list2)
		{
			System.out.println(s.getName()+" "+s.getSal());
		}
		int end2=(int) System.currentTimeMillis();
		System.out.println("completed In="+(end2-start2)+" MilliSec");
	}

}
