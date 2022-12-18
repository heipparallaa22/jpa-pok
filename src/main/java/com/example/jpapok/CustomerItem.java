package com.example.jpapok;

import com.example.jpapok.order22.Customer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "customer_item")
public class CustomerItem {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@Column(name = "description", length = Integer.MAX_VALUE)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}