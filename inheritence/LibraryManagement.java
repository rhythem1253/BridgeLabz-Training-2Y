class Book {
    String title;
    int publicationYear;

    void displayInfo() {
        System.out.println("Book Title: " + title);
    }
}

class Author extends Book {
    String name;
    String bio;

    @Override
    void displayInfo() {
        System.out.println("Author Name: " + name);
    }
}
