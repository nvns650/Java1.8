package com.bo;

import java.util.List;

public class Shipment {
private String shipmentId;
private String shipmentType;
private Address address;
private List<Item> items ;
@Override
public String toString() {
	return "Shipment [shipmentId=" + shipmentId + ", shipmentType=" + shipmentType + ", address=" + address + ", items="
			+ items + "]";
}
public String getShipmentId() {
	return shipmentId;
}
public void setShipmentId(String shipmentId) {
	this.shipmentId = shipmentId;
}
public String getShipmentType() {
	return shipmentType;
}
public void setShipmentType(String shipmentType) {
	this.shipmentType = shipmentType;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public List<Item> getItems() {
	return items;
}
public void setItems(List<Item> items) {
	this.items = items;
}
}
