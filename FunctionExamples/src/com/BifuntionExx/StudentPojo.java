package com.BifuntionExx;

public class StudentPojo {
private String name;
private int marks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public StudentPojo(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
}
public void setGrade(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "StudentPojo [name=" + name + ", marks=" + marks + "]";
}
}
