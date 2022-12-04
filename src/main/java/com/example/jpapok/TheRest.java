package com.example.jpapok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheRest {

	@Autowired
	private CustomersRepository customersRepository;

	@GetMapping("/getit")
	public String getit() {
		return "Hello from Get It";
	}

	@GetMapping("/customerlist")
	public List<Customers> getCustomer() {
		List<Customers> customers = customersRepository.findAll();
		System.out.println();
		return customers;
	}

	@GetMapping("/customer22")
	public Customers getCustomer22() {
		Customers customers = customersRepository.findById(1L);
		System.out.println();
		return customers;
	}




}
