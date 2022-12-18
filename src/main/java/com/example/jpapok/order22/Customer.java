package com.example.jpapok.order22;

import com.example.jpapok.CustomerItem;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "address", length = 100)
	private String address;

	@JsonManagedReference
	@OneToMany(mappedBy = "customer")
	private Set<CustomerItem> customerItems = new LinkedHashSet<>();

	public Set<CustomerItem> getCustomerItems() {
		return customerItems;
	}

	public void setCustomerItems(Set<CustomerItem> customerItems) {
		this.customerItems = customerItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}