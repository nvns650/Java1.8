package com.orderCheck;

import java.util.ArrayList;
import java.util.List;

public class Shipments {
	private int shipmnt_Id;
	private String deliveryOption;
	private List<Items> items;
	
	
	
	
	private DeliveryAddress deliveryAddress;
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public int getShipmnt_Id() {
		return shipmnt_Id;
	}
	public void setShipmnt_Id(int shipmnt_Id) {
		this.shipmnt_Id = shipmnt_Id;
	}
	public String getDeliveryOption() {
		return deliveryOption;
	}
	public void setDeliveryOption(String deliveryOption) {
		this.deliveryOption = deliveryOption;
	}
	public Shipments(int shipmnt_Id, String deliveryOption, List<Items> items) {
		super();
		this.shipmnt_Id = shipmnt_Id;
		this.deliveryOption = deliveryOption;
		this.items = items;
	}
	
	
	
}
