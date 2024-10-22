package lib;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Book implements Serializable{

	
	private static final long serialVersionUID = 2857605828076856319L;
	String isbn;
	String title;
	BookType bt;
	Double price;
	LocalDate pubDate;
	String author;
	

	
	public Book() {
		super();
	}

	public Book(String isbn,String title, BookType bt, Double price, LocalDate pubDate, String author) {
		super();
		this.isbn=isbn;
		this.title = title;
		this.bt = bt;
		this.price = price;
		this.pubDate = pubDate;
		this.author = author;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookType getBt() {
		return bt;
	}

	public void setBt(BookType bt) {
		this.bt = bt;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", bt=" + bt + ", price=" + price + ", pubDate=" + pubDate
				+ ", author=" + author + "]";
	}

	
	
	
	
}
