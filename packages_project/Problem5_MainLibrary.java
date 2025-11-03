import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

/*
Simulates: adding a book, registering a member, issuing a book.
*/
public class Problem5_MainLibrary {
    public static void main(String[] args) {
        Book b = new Book("ISBN001", "Java Fundamentals", "Kumar");
        Member m = new Member("M100", "Rita");

        b.print();
        m.print();

        Transaction t = new Transaction(b, m, "2025-11-03");
        boolean ok = t.issue();
        System.out.println("Issue successful: " + ok);
        b.print();
    }
}
