
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    public LibraryBook() { this("", "", 0.0, true); }
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title; this.author = author; this.price = price; this.availability = availability;
    }

    public boolean borrow() {
        if (availability) { availability = false; return true; }
        return false;
    }
    public void returnBook() { availability = true; }
}
