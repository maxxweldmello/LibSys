import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. Add a new member");
            System.out.println("3. Issue a book");
            System.out.println("4. Return a book");
            System.out.println("5. View all books");
            System.out.println("6. View all members");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    System.out.println("Book '" + title + "' added successfully.");
                    break;

                case 2:
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    Member member = new Member(memberId, name);
                    library.addMember(member);
                    System.out.println("Member '" + name + "' added successfully.");
                    break;

                case 3:
                    System.out.print("Enter book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter member ID to issue the book to: ");
                    int issueMemberId = scanner.nextInt();
                    library.issueBook(issueBookId, issueMemberId);
                    break;

                case 4:
                    System.out.print("Enter book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    library.returnBook(returnBookId);
                    break;

                case 5:
                    System.out.println("All books:");
                    library.viewAllBooks();
                    break;

                case 6:
                    System.out.println("All members:");
                    library.viewAllMembers();
                    break;

                case 7:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
