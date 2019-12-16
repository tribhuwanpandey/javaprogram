package com.nobelit.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="id")
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	@Column(name="Name")
	private String bookName;
	@Column(name="authorName")
	private String authorName;
	@Column(name="published")
	private Date publishedDate;
	@Column(name="price")
	private int bookPrice;

	public Book(String bookName, String authorName, Date publishedDate, int price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishedDate = publishedDate;
		this.bookPrice = price;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
		
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publishedDate="
				+ publishedDate + ", bookPrice=" + bookPrice + "]";
	}


	

}
