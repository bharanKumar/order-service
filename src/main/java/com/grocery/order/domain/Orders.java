package com.grocery.order.domain;

import java.util.List;

import lombok.Data;

@Data
public class Orders {

	private String status;
	
	private String transactionId;
	
	private List<Order> orders;
}
