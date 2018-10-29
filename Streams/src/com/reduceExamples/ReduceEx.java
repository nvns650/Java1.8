package com.reduceExamples;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.reduceExamples.Employee.Gender;

public class ReduceEx {

	public static void main(String[] args) {
		
		    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,
		        Month.JANUARY, 1), 2343.0);
		    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,
		        Month.JULY, 21), 7100.0);
		    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,
		        Month.MAY, 29), 5455.0);
		    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,
		        Month.OCTOBER, 16), 1800.0);
		    Employee p5 = new Employee(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,
		        Month.DECEMBER, 13), 1234.0);
		    Employee p6 = new Employee(6, "Jason", Gender.MALE, LocalDate.of(1976,
		        Month.JUNE, 9), 3211.0);
		    

		    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
		    //one method
		   Optional<Employee> person = persons.stream().reduce((a1,a2) -> a1.getIncome() > a2.getIncome() ? a2:a1);
		 if(person.isPresent()){
			 System.out.println(person.get());
		 }
		  
		 //Optional<Employee> reduceSum= persons.stream().reduce(0.0, (a,persos)->  a+ persos.getIncome(), int::sum).;
		  // Optional<Employee> person2 =persons.stream().map(Employee::getIncome).sum(); normal sum wontwork
		 Double sum1 = persons.stream().map(Employee::getIncome).reduce(0.0, Double::sum);
		 System.out.println("sum1= "+sum1);
		 		/*----OR-----*/
		 Double sum2=persons.stream().mapToDouble(Employee::getIncome).sum();
		 System.out.println("sum2= "+sum2);
	}

}
