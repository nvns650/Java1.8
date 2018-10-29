package com.bo;

public class Item {
private String itemId;
private Double price;
private String itemType;
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Item [itemId=" + itemId + ", price=" + price + ", itemType=" + itemType + "]";
}
public String getItemType() {
	return itemType;
}
public void setItemType(String itemType) {
	this.itemType = itemType;
}
}
