package com.grocery.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.order.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	public List<Order> findAll();
	
	public List<Order> findByCustomerId(Long customerId);
}
