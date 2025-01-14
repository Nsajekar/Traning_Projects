package com.euronet.main.domain;

public class QuantityObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		int itemcount = order.getQuantity();
		if (itemcount <= 5) {
			order.setShippingcost(30);
		}else{
			order.setShippingcost(0);
		}
	}

}
