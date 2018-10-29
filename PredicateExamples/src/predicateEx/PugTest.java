package predicateEx;

import java.util.Scanner;
import java.util.function.Predicate;

public class PugTest {

	public static void main(String[] args) {
		Predicate<SEng> check = u -> u.getAge()>=18 && u.isMarried()==false;
		/*Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();*/
		SEng eng[] = {new SEng("harish",17,false),new SEng("kiran",26,true)};
		for(SEng se : eng)
		{
			if(check.test(se))
			{
				System.out.println("alowed="+se.getName());
			}
			else
			{
				System.out.println("Not alowed="+se.getName());
			}
		}

	}

}
