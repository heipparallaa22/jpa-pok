package com.example.jpapok;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Order33Service {

	@Autowired
	private Order33Repository order33Repository;

	@Transactional
	public Order33 getOrderById(Long id) {
		Optional<Order33> order33 = order33Repository.findById(id);

		Order33 theOrder = order33.get();

		System.out.println();

		return theOrder;
	}

	@Transactional
	public List<Order33> findAll() {
		List<Order33> order33List = order33Repository.findAll();
		System.out.println();

		return order33List;
	}
}
