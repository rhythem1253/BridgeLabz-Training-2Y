import java.util.ArrayList;
import java.util.List;

public class Problem9_Cart {
    public static class Cart<T> {
        private List<T> items = new ArrayList<>();
        public void addItem(T item){ items.add(item); }
        public void removeItem(T item){ items.remove(item); }
        public void displayItems(){ System.out.println("Cart items: " + items); }
    }

    static class Electronics { String name; Electronics(String n){name=n;} public String toString(){return "Electronics:"+name;} }
    static class Clothing { String name; Clothing(String n){name=n;} public String toString(){return "Clothing:"+name;} }

    public static void main(String[] args) {
        Cart<Electronics> elecCart = new Cart<>();
        elecCart.addItem(new Electronics("Phone"));
        elecCart.addItem(new Electronics("Headphones"));
        elecCart.displayItems();

        Cart<Clothing> clothCart = new Cart<>();
        clothCart.addItem(new Clothing("T-Shirt"));
        clothCart.displayItems();
    }
}
