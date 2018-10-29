package com.orderCheck;

public class DeliveryAddress {
private String street;
private int hno;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public DeliveryAddress(String street, int hno) {
	super();
	this.street = street;
	this.hno = hno;
}

}
