package com.cdac.acts;
import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String title;
    private BookType bookType;
    private double price;
    private LocalDate publishedDate;
    private String authorName;
    private int quantity;

    public Book(String title, BookType bookType, double price, LocalDate publishedDate, String authorName, int quantity) {
        this.title = title;
        this.bookType = bookType;
        this.price = price;
        this.publishedDate = publishedDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public BookType getBookType() {
        return bookType;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void allotBook() {
        if (quantity > 0) {
            quantity--;
        } else {
            throw new RuntimeException("No more copies available.");
        }
    }

    public void returnBook() {
        quantity++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookType=" + bookType +
                ", price=" + price +
                ", publishedDate=" + publishedDate +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}