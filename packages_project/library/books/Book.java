package library.books;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean issued = false;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return issued; }

    public void setIssued(boolean issued) { this.issued = issued; }

    public void print() {
        System.out.println("Book: " + title + " by " + author + " (ISBN: " + isbn + ") Issued: " + issued);
    }
}
