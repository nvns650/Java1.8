package com.acceptDataFromObject;

public class Student {
private String name;
private int sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Student(String name, int sal) {
	super();
	this.name = name;
	this.sal = sal;
}
@Override
public String toString() {
	return "Student [name=" + name + ", sal=" + sal + "]";
}

}
