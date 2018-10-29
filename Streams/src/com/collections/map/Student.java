package com.collections.map;

public class Student {
private String name;
private int age;
private int sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Student(String name, int age, int sal) {
	super();
	this.name = name;
	this.age = age;
	this.sal = sal;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", sal=" + sal + "]";
}
}
