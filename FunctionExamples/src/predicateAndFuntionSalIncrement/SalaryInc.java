package predicateAndFuntionSalIncrement;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryInc {

	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList<Employee>();
		list.add(new Employee("Ram", 7890));
		list.add(new Employee("kesh", 4340));
		list.add(new Employee("san",4928 ));
		System.out.println("Before");
		System.out.println(list);
		Predicate<Employee> salcheck = s -> s.getSal()<5000;
		Function<Employee,Employee> fun = l -> {
			int sal = l.getSal()+400;
			l.setSal(sal);
			return l;
		};
		ArrayList<Employee> list2= new ArrayList<Employee>();
		
		for(Employee e :list)
		{
			if(salcheck.test(e))
			{
				
				list2.add(fun.apply(e));
			}
			else
				list2.add(e);
		}
		System.out.println("after");
		System.out.println(list2);
		

	}

}
