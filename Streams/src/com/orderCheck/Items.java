package com.orderCheck;

public class Items {
	private int upc;
	private int qnty;
	private String description;
	public int getUpc() {
		return upc;
	}
	public void setUpc(int upc) {
		this.upc = upc;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Items(int upc, int qnty, String description) {
		super();
		this.upc = upc;
		this.qnty = qnty;
		this.description = description;
	}
}
