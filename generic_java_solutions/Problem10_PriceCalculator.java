import java.util.List;

public class Problem10_PriceCalculator {
    static class Product { private double price; public Product(double p){price=p;} public double getPrice(){return price;} @Override public String toString(){return "Product("+price+")";} }
    static class Mobile extends Product { public Mobile(double p){super(p);} }
    static class Laptop extends Product { public Laptop(double p){super(p);} }

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = java.util.Arrays.asList(new Mobile(199.99), new Mobile(299.49));
        List<Laptop> laptops = java.util.Arrays.asList(new Laptop(799.0), new Laptop(999.0));
        System.out.println("Mobiles total: " + calculateTotal(mobiles));
        System.out.println("Laptops total: " + calculateTotal(laptops));
    }
}
