package com.orderCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BO {

	public static void main(String[] args) {
	OrderBO orderBO1 =new OrderBO();
	
	
	
	List<Items> listItems= new ArrayList<>();
	listItems.add(new Items(101, 1, "shirt"));
	listItems.add(new Items(102, 2, "Mobile"));
	listItems.add(new Items(103, 3, "Shoes"));
	
	
	orderBO1.setOrderNumber(1000);
	List<Shipments> shipList1= new ArrayList<>();
//	shipList1.add(new Shipments(101, "G"));
	orderBO1.setShipments(shipList1);
	
	OrderBO orderBO2 =new OrderBO();
	
	orderBO2.setOrderNumber(2000);
	List<Shipments> shipList2= new ArrayList<>();
	//shipList2.add(new Shipments(201, "M"));
	orderBO2.setShipments(shipList2);
	
	List<OrderBO> orderList = new ArrayList<>();
	orderList.add(orderBO1);
	orderList.add(orderBO2);
	
	
	orderList.stream().map(x -> x.getShipments()).flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(s-> System.out.println(s));
	
	}

}
