import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void viewAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the library.");
        } else {
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    public void issueBook(int bookId, int memberId) {
        Book book = null;
        Member member = null;

        for (Book b : books) {
            if (b.getBookId() == bookId) {
                book = b;
                break;
            }
        }

        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                member = m;
                break;
            }
        }

        if (book != null && member != null) {
            if (!book.isIssued()) {
                book.setIssued(true);
                member.setIssuedBookId(bookId);
                System.out.println("Book '" + book.getTitle() + "' issued to " + member.getName());
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid book ID or member ID.");
        }
    }

    public void returnBook(int bookId) {
        Book book = null;
        Member member = null;

        for (Book b : books) {
            if (b.getBookId() == bookId) {
                book = b;
                break;
            }
        }

        for (Member m : members) {
            if (m.getIssuedBookId() == bookId) {
                member = m;
                break;
            }
        }

        if (book != null && member != null && book.isIssued()) {
            book.setIssued(false);
            member.setIssuedBookId(-1);
            System.out.println("Book '" + book.getTitle() + "' returned successfully.");
        } else {
            System.out.println("Invalid book ID or the book was not issued.");
        }
    }
}
