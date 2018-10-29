package com.flatMapEx;

public class Address {
private String doorN0;
private String area;
public String getDoorN0() {
	return doorN0;
}
public void setDoorN0(String doorN0) {
	this.doorN0 = doorN0;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public Address(String doorN0, String area) {
	super();
	this.doorN0 = doorN0;
	this.area = area;
}
@Override
public String toString() {
	return "Address [doorN0=" + doorN0 + ", area=" + area + "]";
}
}
