package com.grocery.order.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="estimated_delivery_date")
	private LocalDate estimatedDeliveryDate;
}
