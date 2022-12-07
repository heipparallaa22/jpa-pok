package com.example.jpapok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheRest {

	@Autowired
	private ReviewService reviewService;

	@Autowired
	private Order33Service order33Service;

	@GetMapping("/order33/{id}")
	@ResponseBody
	public Order33 getOrderById(@PathVariable Long id) {

		Order33 order33 = order33Service.getOrderById(id);

		Order33Dto order33Dto = new Order33Dto(order33);

		return order33;
	}

	@GetMapping("/order33/all")
	public List<Order33> getOrder33List() {
		return order33Service.findAll();
	}


	@GetMapping("/review/all")
	public List<Review> getReviews() {
		return reviewService.getAll();
	}


	@GetMapping("/review/{id}")
	public Review findById(@PathVariable Long id) {
		return reviewService.findById(id);
	}
}
