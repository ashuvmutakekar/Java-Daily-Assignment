package Library;

import java.time.LocalDate;
import java.util.Objects;

public class Library {
	String title;
	BookType bt;
	
	Double price;
	LocalDate pubDate;
	String author;
	Integer quantity;

	
	public Library() {
		super();
	}

	public Library(String title, BookType bt, Double price, LocalDate pubDate, String author, Integer quantity) {
		super();
		this.title = title;
		this.bt = bt;
		this.price = price;
		this.pubDate = pubDate;
		this.author = author;
		this.quantity = quantity;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Library [title=" + title + ", bt=" + bt + ", price=" + price + ", pubDate=" + pubDate + ", author="
				+ author + ", quantity=" + quantity + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, bt, price, pubDate, quantity, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(author, other.author) && bt == other.bt && Objects.equals(price, other.price)
				&& Objects.equals(pubDate, other.pubDate) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(title, other.title);
	}
}
