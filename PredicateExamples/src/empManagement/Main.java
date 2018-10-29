package empManagement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
	ArrayList<Employees> list= new ArrayList<Employees>();
	populate(list);
	
	System.out.println(list);
	for(Employees e :list)
	{
		System.out.println(e);
	}
	

	 Predicate<Employees> p1=emp -> emp.getDesignation().equals("Developer");
	 System.out.println("Developers Information:");
	 display(p1,list);
	
	 Predicate<Employees> p2=emp->emp.getCity().equals("WGL");
	 System.out.println("WGL Employees Information:");
	 display(p2,list); 
	 Predicate<Employees> isCEO=Predicate.isEqual(new Employees("Durga","CEO",30000,"Hyderabad"));
			 
			  Employees e1=new Employees("Durga","CEO",30000,"Hyderabad");
			  
			  Employees e2=new Employees("Sunny","Manager",20000,"Hyderabad");
			  System.out.println(isCEO.test(e1));//true
			  System.out.println(isCEO.test(e2));//false 
		}
	
	private static void populate(ArrayList<Employees> list) {
		list.add(new Employees("Naveen", "Developer", 78000, "Hyd"));
		list.add(new Employees("harish", "IPS", 98900, "WGL"));
		list.add(new Employees("kiran", "Developer", 89000, "Gachhibowli"));
	}
	private static void  display(Predicate<Employees> p,ArrayList<Employees> list)
	{
		for(Employees e : list)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}

}
