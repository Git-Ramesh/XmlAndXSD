package com.rs.xsd.validator;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book", namespace = "http://www.radiantsage.com/book")
public class Book {
	private int isbn;
	private String name;
	private Double price;
	private List<String> author;
	private String publisher;

	@XmlAttribute(name = "isbn", required = true)
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@XmlElement(name = "name", nillable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "price", nillable = false)
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@XmlElement(name = "author", nillable = false, type = List.class)
	public List<String> getAuthor() {
		return author;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}

	@XmlElement(name = "publisher", nillable = false, type = String.class)
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
