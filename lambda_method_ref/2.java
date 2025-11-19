
// 2. Custom Sorting in E-Commerce using Lambda Comparator

import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String n, double p, double r, double d){
        name=n; price=p; rating=r; discount=d;
    }

    public String toString(){
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount;
    }
}

public class Two {
    public static void main(String[] args){
        List<Product> list=new ArrayList<>();
        list.add(new Product("Phone", 50000, 4.5, 10));
        list.add(new Product("Laptop", 80000, 4.7, 15));
        list.add(new Product("Watch", 15000, 4.2, 5));

        System.out.println("Sort by price:");
        list.sort((a,b)->Double.compare(a.price,b.price));
        list.forEach(System.out::println);

        System.out.println("\nSort by rating:");
        list.sort((a,b)->Double.compare(b.rating,a.rating));
        list.forEach(System.out::println);

        System.out.println("\nSort by discount:");
        list.sort((a,b)->Double.compare(b.discount,a.discount));
        list.forEach(System.out::println);
    }
}
