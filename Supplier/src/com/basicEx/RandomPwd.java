package com.basicEx;

import java.util.Scanner;
import java.util.function.Supplier;

public class RandomPwd {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			int num = 0;
			String pwd = "";
			String string = "ABC@$%&*";
			Supplier<Integer> odd = () -> (int) (Math.random() * 10);
			Supplier<Character> ss = () -> {
				return string.charAt((int) (Math.random() * 7));
			};

			for (int i = 0; i < 7; i++) {
				if (i % 2 == 0) {
					pwd = pwd + odd.get();
				} else
					pwd = pwd + ss.get();

			}
			return pwd;

		};
		String newpwd = s.get();
		System.out.println(newpwd);
		Scanner sc = new Scanner(System.in);
		System.out.println("pwd");
		String test = sc.next();
		if (newpwd.equals(test)) {
			System.out.println("okay");
		} else
			System.out.println("not");

	}
}