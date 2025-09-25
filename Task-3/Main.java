import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Books");
            System.out.println("6. View Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(userId, name));
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int uIdIssue = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bIdIssue = sc.nextInt();
                    library.issueBook(uIdIssue, bIdIssue);
                    break;
                case 4:
                    System.out.print("Enter User ID: ");
                    int uIdReturn = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bIdReturn = sc.nextInt();
                    library.returnBook(uIdReturn, bIdReturn);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    library.displayUsers();
                    break;
                case 7:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
