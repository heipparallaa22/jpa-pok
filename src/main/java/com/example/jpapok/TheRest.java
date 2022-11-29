package com.example.jpapok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheRest {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/getit")
	public String getit() {
		return "Hello from Get It";
	}

	@GetMapping("/customerlist")
	public List<Customer> getCustomer() {
		List<Customer> customers = customerRepository.findAll();
		System.out.println();
		return customers;
	}

	@GetMapping("/customer22")
	public Customer getCustomer22() {
		Customer customers = customerRepository.findById(1L);
		System.out.println();
		return customers;
	}




}
