package com.grocery.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.order.domain.Order;
import com.grocery.order.domain.Orders;
import com.grocery.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;

	public Orders getAllOrders(){
		Orders orders = new Orders();
		orders.setOrders(convertToDomain(orderRepo.findAll()));
		return orders;
	}
	
	public Orders getCustomerOrders(Long customerId) {
		Orders orders = new Orders();
		orders.setOrders(convertToDomain(orderRepo.findByCustomerId(customerId)));
		return orders;
	}

	private List<Order> convertToDomain(List<com.grocery.order.entity.Order> entities) {
		ArrayList<Order> ordersList = new ArrayList<Order>();
		for(com.grocery.order.entity.Order ordEntity : entities) {
			Order order = new Order();
			BeanUtils.copyProperties(ordEntity, order);
			ordersList.add(order);
		}
		return ordersList;
	}

}
