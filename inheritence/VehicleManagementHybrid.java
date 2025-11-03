interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Electric Vehicle charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle refueling");
    }
}
