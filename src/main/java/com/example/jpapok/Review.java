package com.example.jpapok;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

//	@JsonManagedReference
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "book_id", nullable = false)
	private Book book;

//	@JsonManagedReference
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "reader_id", nullable = false)
	private Reader reader;

	@Column(name = "description", length = Integer.MAX_VALUE)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}