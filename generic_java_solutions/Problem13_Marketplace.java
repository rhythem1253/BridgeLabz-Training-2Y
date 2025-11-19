import java.util.ArrayList;
import java.util.List;

public class Problem13_Marketplace {
    // Simple categories
    interface Category {}
    enum BookCategory implements Category { FICTION, NONFICTION }
    enum ClothingCategory implements Category { MEN, WOMEN }

    public static class Product<T extends Category> {
        private String name;
        private double price;
        private T category;
        public Product(String name, double price, T category) { this.name = name; this.price = price; this.category = category; }
        public double getPrice(){ return price; }
        public String toString(){ return name + "("+category+":"+price+")"; }
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        // can't change product.price (private), but demonstrate by printing discounted value
        double discounted = product.getPrice() * (1 - percentage/100.0);
        System.out.println(product + " -> discounted price: " + discounted);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, BookCategory.FICTION);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 299, ClothingCategory.MEN);
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
    }
}
