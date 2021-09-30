package com.grocery.order.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import com.grocery.order.domain.Orders;
import com.grocery.order.service.OrderService;

@RestController
public class OrderController {
	
	private OrderService orderService;
	
	private RestTemplate rest;
	
	@Autowired
	public OrderController(OrderService orderService, RestTemplate rest) {
		this.orderService = orderService;
		this.rest = rest;
	}

	@GetMapping("/all")
	public ResponseEntity<Orders> getAllOrders() {
		Orders orders = orderService.getAllOrders();
		orders.setStatus("SUCCESS");
		return new ResponseEntity<Orders>(orders, HttpStatus.OK);
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Orders> getCustomerOrders(@PathVariable Long id){
		Orders orders = orderService.getCustomerOrders(id);
		return new ResponseEntity<Orders>(orders, HttpStatus.OK);
	}
}
