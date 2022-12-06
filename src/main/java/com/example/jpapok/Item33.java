package com.example.jpapok;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "item33")
public class Item33 {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "order33_id", nullable = false)
	private Order33 order33;

	@Column(name = "description", length = Integer.MAX_VALUE)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order33 getOrder33() {
		return order33;
	}

	public void setOrder33(Order33 order33) {
		this.order33 = order33;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}