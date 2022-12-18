package com.example.jpapok.service;


import com.example.jpapok.order22.Customer;
import com.example.jpapok.order22.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Transactional
	public Customer findById(Long id) {
		Customer customer = customerRepository.findById(id).get();
		return customer;
	}
}
