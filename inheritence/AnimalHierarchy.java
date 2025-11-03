class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
