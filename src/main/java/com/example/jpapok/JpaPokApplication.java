package com.example.jpapok;

import com.example.jpapok.service.Order33Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;


@SpringBootApplication
// @Transactional
public class JpaPokApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaPokApplication.class);

	@Autowired
	private Order33Service order33Service;

	public static void main(String[] args) {
		SpringApplication.run(JpaPokApplication.class, args);
	}


//	@Bean
//	@Transactional
/*
	public CommandLineRunner demo(Order22Repository repository) {

		order33Service.findAll();

		order33Service.getOrderById(1L);

		order22Service.getOrderById();

		List<Order22> order22s =  repository.findAll();

		Long id = 1L;
		Optional<Order22> order22 = repository.findById(id);

		Order22 order221 = order22.get();

		// Order22 order22 = repository.findById(id);

		System.out.println();

		return null;
	}
*/

}
