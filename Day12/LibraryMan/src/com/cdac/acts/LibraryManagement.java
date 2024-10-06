package com.cdac.acts;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibraryManagement {
    private static Set<Book> books = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management Menu:");
            System.out.println("1. Add book");
            System.out.println("2. Display all books");
            System.out.println("3. Allot book to student");
            System.out.println("4. Take book return");
            System.out.println("5. Remove book");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    allotBookToStudent();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    removeBook();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        try {
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();

            BookType bookType;
            while (true) {
                try {
                    System.out.print("Enter Book Type (FICTION, NON_FICTION, SCIENCE, TECHNOLOGY, ART): ");
                    bookType = BookType.valueOf(scanner.nextLine().toUpperCase());
                    break; // Break the loop if valid input
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Book Type. Please enter a valid type.");
                }
            }

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Published Date (YYYY-MM-DD): ");
            LocalDate publishedDate = LocalDate.parse(scanner.nextLine());

            System.out.print("Enter Author Name: ");
            String authorName = scanner.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Book book = new Book(title, bookType, price, publishedDate, authorName, quantity);
            if (!books.add(book)) {
                throw new RuntimeException("Duplicate book entry.");
            }

            System.out.println("Book added successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void allotBookToStudent() {
        System.out.print("Enter Book Title to allot: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                try {
                    book.allotBook();
                    System.out.println("Book allotted successfully.");
                    return;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    private static void returnBook() {
        System.out.print("Enter Book Title to return: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void removeBook() {
        System.out.print("Enter Book Title to remove: ");
        String title = scanner.nextLine();

        try {
            boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
            if (!removed) {
                throw new BookNotFoundException("Book not found.");
            }
            System.out.println("Book removed successfully.");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
