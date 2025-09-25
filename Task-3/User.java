import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Book> issuedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
        book.setIssued(true);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
        book.setIssued(false);
    }

    public void display() {
        System.out.println("User ID: " + id + " | Name: " + name);
        if (issuedBooks.isEmpty()) {
            System.out.println("No books issued.");
        } else {
            System.out.println("Issued Books:");
            for (Book b : issuedBooks) {
                System.out.println(" - " + b.getTitle());
            }
        }
    }
}
