package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private String date;

    public Transaction(Book book, Member member, String date) {
        this.book = book;
        this.member = member;
        this.date = date;
    }

    public boolean issue() {
        if (book.isIssued()) return false;
        book.setIssued(true);
        return true;
    }

    public boolean returnBook() {
        if (!book.isIssued()) return false;
        book.setIssued(false);
        return true;
    }

    public void print() {
        System.out.println("Transaction: Book=" + book.getTitle() + ", Member=" + member.getName() + ", Date=" + date);
    }
}
