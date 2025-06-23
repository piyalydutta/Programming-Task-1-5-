import java.util.ArrayList;

public class Book {
    // Attributes
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // Display book information
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }

    // Collection to manage books
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    // Method to add a book
    public static void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to remove a book by ISBN
    public static void removeBook(String ISBN) {
        bookCollection.removeIf(book -> book.getISBN().equals(ISBN));
        System.out.println("Book with ISBN " + ISBN + " removed.");
    }

    // Method to display all books
    public static void displayBooks() {
        System.out.println("\n--- Book Collection ---");
        for (Book book : bookCollection) {
            book.displayInfo();
        }
        if (bookCollection.isEmpty()) {
            System.out.println("No books available.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        // Adding books to the collection
        addBook(book1);
        addBook(book2);

        // Displaying the collection
        displayBooks();

        // Removing a book
        removeBook("9780132350884");

        // Displaying the collection after removal
        displayBooks();
    }
}

