package com.bo;

import java.util.List;

public class OrderBO {
	private List<Shipment> shipment;
	
	
	public List<Shipment> getShipment() {
		return shipment;
	}
	public void setShipment(List<Shipment> shipment) {
		this.shipment = shipment;
	}
	@Override
	public String toString() {
		return "OrderBO [shipment=" + shipment + "]";
	}
	
	

}