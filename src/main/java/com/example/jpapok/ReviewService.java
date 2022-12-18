package com.example.jpapok;

import com.example.jpapok.order22.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;


	@Transactional
	public List<Review> getAll() {
		List<Review> reviewList = reviewRepository.findAll();
		return reviewRepository.findAll();
	}

	@Transactional
	public Review findById(Long id) {
		Review review = reviewRepository.findById(id).get();
		return reviewRepository.findById(id).get();
	}
}
