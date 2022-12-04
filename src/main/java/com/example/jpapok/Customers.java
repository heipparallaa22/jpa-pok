package com.example.jpapok;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customers {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	private String name;

	protected Customers() {}

	public Customers(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%d, name='%s']",
				id, name);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
