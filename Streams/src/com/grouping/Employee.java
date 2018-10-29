package com.grouping;

import java.time.LocalDate;

public class Employee {
	public static enum Gender {
	    MALE, FEMALE
	  }

	  private long id;
	  private String name;
	  private Gender gender;
	  private LocalDate dob;
	  private double income;
	  public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	public Employee(long id, String name, Gender gender, LocalDate dob, double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.income = income;
	}
	
	@Override
	public String toString() {
		String str= String.format(("[%s,%s,%s,%s,%.2f]"),id,  name, gender,  dob, income);
		return str;
	}
}
