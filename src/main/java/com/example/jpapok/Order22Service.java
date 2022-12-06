package com.example.jpapok;

import com.example.jpapok.order22.Customer;
import com.example.jpapok.order22.Order22;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Order22Service {

	@Autowired
	private Order22Repository order22Repository;

	@Transactional
	public void getOrderById() {

		Optional<Order22> order22 = order22Repository.findById(1L);

		Order22 theOrder = order22.get();

		Customer customer = theOrder.getCustomer();
		System.out.println();
	}
}
