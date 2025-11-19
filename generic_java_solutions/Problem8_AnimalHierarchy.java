import java.util.List;

public class Problem8_AnimalHierarchy {
    static class Animal { public String name; public Animal(String n){name=n;} @Override public String toString(){return name;} }
    static class Dog extends Animal { public Dog(String n){super(n);} }
    static class Cat extends Animal { public Cat(String n){super(n);} }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println("Animal: " + a);
    }

    public static void main(String[] args) {
        List<Dog> dogs = java.util.Arrays.asList(new Dog("Rex"), new Dog("Bruno"));
        List<Cat> cats = java.util.Arrays.asList(new Cat("Kitty"), new Cat("Mittens"));
        printAnimals(dogs);
        printAnimals(cats);
    }
}
