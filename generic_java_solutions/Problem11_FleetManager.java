import java.util.ArrayList;
import java.util.List;

public class Problem11_FleetManager {
    static class Vehicle { String id; Vehicle(String id){this.id=id;} public String toString(){return id;} }
    static class Truck extends Vehicle { Truck(String id){super("Truck-"+id);} }
    static class Bike extends Vehicle { Bike(String id){super("Bike-"+id);} }

    static class FleetManager<T extends Vehicle> {
        private List<T> fleet = new ArrayList<>();
        public void addVehicle(T v){ fleet.add(v); }
        public void showFleet(){ System.out.println("Fleet: " + fleet); }
    }

    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("T1"));
        truckFleet.addVehicle(new Truck("T2"));
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("B1"));
        bikeFleet.showFleet();
    }
}
