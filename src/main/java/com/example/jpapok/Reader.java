package com.example.jpapok;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "reader")
public class Reader {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
	private String name;

/*
	@JsonBackReference
	@OneToMany(mappedBy = "reader")
	private Set<Review> reviews = new LinkedHashSet<>();
*/

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

/*
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
*/

}