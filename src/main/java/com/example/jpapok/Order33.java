package com.example.jpapok;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "order33")
public class Order33 {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
	private String description;

//	@JsonIgnore
	@JsonManagedReference
	@OneToMany(mappedBy = "order33")
	private Set<Item33> itemList = new LinkedHashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Item33> getItemList() {
		return itemList;
	}

	public void setItemList(Set<Item33> item33s) {
		this.itemList = item33s;
	}

}