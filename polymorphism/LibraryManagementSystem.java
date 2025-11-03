abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void setItemId(String itemId) {
        if (itemId == null || itemId.trim().isEmpty()) throw new IllegalArgumentException("Invalid itemId");
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Invalid title");
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null) author = "";
        this.author = author;
    }

    public String getItemDetails() {
        return "ItemId: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // days
    }

    @Override
    public boolean reserveItem(String userId) {
        if (!available) return false;
        available = false;
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}
