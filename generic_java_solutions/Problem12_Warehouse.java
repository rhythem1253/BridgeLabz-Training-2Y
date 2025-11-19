import java.util.ArrayList;
import java.util.List;

public class Problem12_Warehouse {
    public static abstract class WarehouseItem { String name; WarehouseItem(String n){this.name=n;} public String toString(){return name;} }
    public static class Electronics extends WarehouseItem { public Electronics(String n){super(n);} }
    public static class Groceries extends WarehouseItem { public Groceries(String n){super(n);} }
    public static class Furniture extends WarehouseItem { public Furniture(String n){super(n);} }

    public static class Storage<T extends WarehouseItem> {
        private List<T> items = new ArrayList<>();
        public void addItem(T item){ items.add(item); }
        public T get(int idx){ return items.get(idx); }
        public List<T> getAll(){ return items; }
    }

    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem w : items) System.out.println(" - " + w);
    }

    public static void main(String[] args) {
        Storage<Electronics> elecStore = new Storage<>();
        elecStore.addItem(new Electronics("TV"));
        elecStore.addItem(new Electronics("Speaker"));

        Storage<Groceries> grocStore = new Storage<>();
        grocStore.addItem(new Groceries("Rice"));
        grocStore.addItem(new Groceries("Oil"));

        System.out.println("Electronics store:");
        displayAll(elecStore.getAll());
        System.out.println("Groceries store:");
        displayAll(grocStore.getAll());
    }
}
