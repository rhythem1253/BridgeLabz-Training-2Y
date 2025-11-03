interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    @Override
    public void performDuties() {
        System.out.println("Chef prepares meals");
    }
}

class Waiter extends Person implements Worker {
    @Override
    public void performDuties() {
        System.out.println("Waiter serves customers");
    }
}
