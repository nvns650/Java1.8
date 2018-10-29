package predicateEx;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p = u -> u.getUsername().equals("durga") && u.getPassword().equals("java");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		String pwd= sc.next();
		User user =new User(name,pwd);
		if(p.test(user))
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("No");
		}

	}

}
