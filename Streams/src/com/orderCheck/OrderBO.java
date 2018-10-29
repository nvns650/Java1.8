package com.orderCheck;

import java.util.List;

public class OrderBO {
	private long orderNumber;
	private List<Shipments> shipments;

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<Shipments> getShipments() {
		return shipments;
	}

	public void setShipments(List<Shipments> shipments) {
		this.shipments = shipments;
	}

}
