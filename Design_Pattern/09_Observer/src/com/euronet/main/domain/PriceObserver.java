package com.euronet.main.domain;

public class PriceObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
         double cost = order.getItemcost();
         if(cost>=500){
        	 order.setDiscount(50);
         }
         if(cost>=200 && cost<=499){
        	 order.setDiscount(20);
         }
	}
}
