package com.example.jpapok.order22;

import jakarta.persistence.*;

@Entity
@Table(name = "order22")
public class Order22 {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;



	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;



	@Column(name = "comment", length = Integer.MAX_VALUE)
	private String comment;

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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	@Override
	public String toString() {
		return "Order22{" +
				"id=" + id +
				", customer=" + customer +
				", item=" + item +
				", comment='" + comment + '\'' +
				'}';
	}
}