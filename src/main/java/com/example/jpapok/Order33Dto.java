package com.example.jpapok;

import java.util.LinkedHashSet;
import java.util.Set;

public class Order33Dto {

	private Long id;

	private String description;

	private Set<Item33> item33s = new LinkedHashSet<>();

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

	public Set<Item33> getItem33s() {
		return item33s;
	}

	public void setItem33s(Set<Item33> item33s) {
		this.item33s = item33s;
	}


	public Order33Dto(Order33 order33){
		this.id = order33.getId();
		this.description = order33.getDescription();
		this.item33s = order33.getItemList();

		System.out.println();
	}

}


