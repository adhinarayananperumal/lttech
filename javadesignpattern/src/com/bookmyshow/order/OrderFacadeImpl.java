package com.bookmyshow.order;

public class OrderFacadeImpl {

	OrderDetailImpl orderDetailImpl = new OrderDetailImpl();

	OrderImpl orderImpl = new OrderImpl();

	String getOrderDetail() {
		orderImpl.orderDet();
		return null;
	}
	
	
	
	String getOrderListOfProduct() {
	return 	orderDetailImpl.getOrderListOfProduct();
	}


}
