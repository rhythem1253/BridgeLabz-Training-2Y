
public class BasicBook {
    String title;
    String author;
    double price;

    public BasicBook() {
        this("Unknown", "Unknown", 0.0);
    }

    public BasicBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return title + " by " + author + " - " + price;
    }
}
