package com.example.jpapok;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

	List<Customers> findByName(String name);

	Customers findById(long id);
}
