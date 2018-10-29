package com.grouping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.reduceExamples.Employee;
import com.reduceExamples.Employee.Gender;

public class GroupingExample {

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
			    // Male and Female count
			    Map<Employee.Gender,Long> GenderCount= persons.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			    System.out.println(GenderCount);
			    System.out.println("------------------------------");
			    // male and female's list
			    Map<Employee.Gender,String> GenderList=persons.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName, Collectors.joining("-"))));
			    System.out.println(GenderList);
			    System.out.println("------------------------------");
			    // male and female's list
			    Map<Employee.Gender,List<String>> GenderList2=persons.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName, Collectors.toList())));
			    System.out.println(GenderList2);
			    System.out.println("------------------------------");
			    // inner grouping gender then dob
			    Map<Gender, Map<Object, String>> ListOnDob=persons.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.groupingBy(p -> p.getDob().getMonth(),Collectors.mapping(Employee::getName, Collectors.joining("-")))));
			    System.out.println(ListOnDob);
			    System.out.println("------------------------------");
			    // income by gender
			    Map<Employee.Gender,DoubleSummaryStatistics> incomeByGender= persons.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summarizingDouble(Employee::getIncome)));
			    System.out.println(incomeByGender);
			    
			    
			    
			    
	}

}
