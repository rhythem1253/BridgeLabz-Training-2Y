import java.util.ArrayList;
import java.util.List;

public class Problem5_FruitBox {
    static class Fruit { public String name; public Fruit(String n){name=n;} @Override public String toString(){return name;} }
    static class Apple extends Fruit { public Apple(){super("Apple");} }
    static class Mango extends Fruit { public Mango(){super("Mango");} }
    static class Car { public String model="Car"; }

    static class FruitBox<T extends Fruit> {
        private List<T> list = new ArrayList<>();
        public void add(T f){ list.add(f); }
        public void display(){
            System.out.println("FruitBox contains:");
            for(T f : list) System.out.println(" - " + f);
        }
    }

    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.display();

        FruitBox<Fruit> mixed = new FruitBox<>();
        mixed.add(new Mango());
        mixed.add(new Apple());
        mixed.display();

        // The following would NOT compile:
        // FruitBox<Car> carBox = new FruitBox<>(); // Car does not extend Fruit
    }
}
