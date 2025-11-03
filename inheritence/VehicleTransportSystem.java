class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Vehicle Info");
    }
}

class Car extends Vehicle {
    int seatCapacity;

    @Override
    void displayInfo() {
        System.out.println("Car with " + seatCapacity + " seats");
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    @Override
    void displayInfo() {
        System.out.println("Truck with load capacity " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;

    @Override
    void displayInfo() {
        System.out.println("Motorcycle with carrier: " + hasCarrier);
    }
}
