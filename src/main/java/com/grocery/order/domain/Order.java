package com.grocery.order.domain;

import lombok.Data;

@Data
public class Order {
	private Long id;

	private Long customerId;
	
	private String description;
	
	private String estimatedDeliveryDate;
	
	private String transactionId;
	
	private String status;
}
