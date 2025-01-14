package com.euronet.main.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderIid;
	private int Quantity;
	private double shippingcost;
	private double itemcost;
	private double discount;

	private List<OrderObserver> observer = new ArrayList<>();

	public void attachObserver(OrderObserver orderObserver) {
		observer.add(orderObserver);
	}

	public boolean detachObserver(OrderObserver orderObserver) {
		boolean result = observer.remove(orderObserver);
		return result;
	}

	public Order(String orderIid, int quantity, double itemcost) {
		super();
		this.orderIid = orderIid;
		Quantity = quantity;
		this.itemcost = itemcost;
	}

	@Override
	public String toString() {
		return "Order [orderIid=" + orderIid + ", Quantity=" + Quantity
				+ ", shippingcost=" + shippingcost + ", itemcost=" + itemcost
				+ ", discount=" + discount + "]";
	}

	public void additem() {
		observer.forEach((o) -> {
			o.updated(this);
		});
	}

	public String getOrderIid() {
		return orderIid;
	}

	public void setOrderIid(String orderIid) {
		this.orderIid = orderIid;
	}

	public double getShippingcost() {
		return shippingcost;
	}

	public void setShippingcost(double shippingcost) {
		this.shippingcost = shippingcost;
	}

	public double getItemcost() {
		return itemcost;
	}

	public void setItemcost(double itemcost) {
		this.itemcost = itemcost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

}
