package com.orderCheck;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bo.Address;
import com.bo.Item;
import com.bo.OrderBO;
import com.bo.Shipment;

public class Java8Ex {
	public static void main(String[] args) {

		OrderBO order = new OrderBO();
		List<Shipment> shipments = new ArrayList<>();
		Shipment shipment = null;
		List<Item> items =null;
		Address address =null;
		//Item item =null;

		shipment = new Shipment();
		shipment.setShipmentId("s1");
		shipment.setShipmentType("standard");
		
		address = new Address();
		address.setCity("Hyd");
		address.setCountry("Ind");
		address.setPin("500084");
				shipment.setAddress(address);
				
		items = new ArrayList<>();
		Item item = new Item();
				item.setItemId("ds65");
				item.setPrice(50.50);
				item.setItemType("xyz");
				

		
		Item item2 = new Item();
		item2.setItemId("das24d4");
		item2.setPrice(90.25);
		item2.setItemType("sas");
		
		
		Item item3 = new Item();
		item3.setItemId("asd465");
		item3.setPrice(15.75);
		item3.setItemType("xyz");
		
		items.add(item);
		items.add(item2);
		items.add(item3);
		
		shipment.setItems(items);
		//adding to list shipments
		shipments.add(shipment);	

		shipment = new Shipment();
		shipment.setShipmentId("s2");
		shipment.setShipmentType("Express");
		address = new Address();
		address.setCity("BBS");
		address.setCountry("Ind");
		address.setPin("751006");
		shipment.setAddress(address);
		items = new ArrayList<>();
		item = new Item();
		item.setItemId("das24d4");
		item.setPrice(60.25);
		item.setItemType("xyz");
		items.add(item);
		item = new Item();
		item.setItemId("das24d4");
		item.setPrice(80.25);
		item.setItemType("sas");
		items.add(item);
		shipment.setItems(items);
		//adding to list of shipments
		shipments.add(shipment);


		order.setShipment(shipments);

		System.out.println(order);
		//Print only Item Price
		System.out.println("------------------");
	/*	Stream<Double> st = shipment.getItems().stream().map(s->s.getPrice());
		System.out.println(st.collect(Collectors.toList()));*/
		//to get all shipments list
		order.getShipment().stream().collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("------------------");
		//to get only items list
		order.getShipment().stream().map(x -> x.getItems()).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("------------------");
		//to get only items list individually
		order.getShipment().stream().map(x -> x.getItems()).flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("------------------");
		// to get single item based on id
		order.getShipment().stream().map(x -> x.getItems()).flatMap(x -> x.stream()).filter(u -> u.getItemId().equals("das24d4") ).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("------------------");
		// only one shipment with items list
		order.getShipment().stream().filter(k -> k.getShipmentType().equalsIgnoreCase("standard")).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("------------------");
		// one shipment with one item
		order.getShipment().stream().filter(k-> k.getShipmentType().equalsIgnoreCase("standard")).peek(System.out::println).map(x -> x.getItems()).flatMap(x -> x.stream()).filter(x -> x.getItemId().equalsIgnoreCase("ds65")).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		//Print items whose price > 20.00
	//	Stream<Item> st = shipment.getItems().stream().filter(p->p.getPrice()>20.00);
}
	}