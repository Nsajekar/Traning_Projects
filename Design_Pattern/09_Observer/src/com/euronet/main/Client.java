package com.euronet.main;

import com.euronet.main.domain.Order;
import com.euronet.main.domain.OrderObserver;
import com.euronet.main.domain.PriceObserver;
import com.euronet.main.domain.QuantityObserver;

public class Client {
public static void main(String[] args) {
	Order order = new  Order("101", 2, 300);
	
	 OrderObserver priceobserver =new PriceObserver();
	 OrderObserver quantityobserver =new QuantityObserver();
	 
	 order.attachObserver(priceobserver);
	 order.attachObserver(quantityobserver);
	 
	 order.additem();
	 System.out.println(order);
	 
}
}
