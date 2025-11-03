abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        setVehicleNumber(vehicleNumber);
        setType(type);
        setRentalRate(rentalRate);
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber == null || vehicleNumber.trim().isEmpty()) throw new IllegalArgumentException("Invalid vehicle number");
        this.vehicleNumber = vehicleNumber;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) throw new IllegalArgumentException("Type cannot be empty");
        this.type = type;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0) throw new IllegalArgumentException("Rate cannot be negative");
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private int seats;
    private String insurancePolicyNumber;
    private double insuranceRatePerDay;

    public Car(String number, double rate, int seats, String policy, double insuranceRatePerDay) {
        super(number, "Car", rate);
        this.seats = seats;
        setInsurancePolicyNumber(policy);
        setInsuranceRatePerDay(insuranceRatePerDay);
    }

    public void setInsurancePolicyNumber(String policy) {
        if (policy == null || policy.trim().isEmpty()) throw new IllegalArgumentException("Policy required");
        this.insurancePolicyNumber = policy;
    }

    public void setInsuranceRatePerDay(double insuranceRatePerDay) {
        if (insuranceRatePerDay < 0) throw new IllegalArgumentException("Insurance rate cannot be negative");
        this.insuranceRatePerDay = insuranceRatePerDay;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRatePerDay;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insured with policy: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private boolean helmetIncluded;
    private String insurancePolicyNumber;
    private double insuranceRatePerDay;

    public Bike(String number, double rate, boolean helmetIncluded, String policy, double insuranceRatePerDay) {
        super(number, "Bike", rate);
        this.helmetIncluded = helmetIncluded;
        setInsurancePolicyNumber(policy);
        setInsuranceRatePerDay(insuranceRatePerDay);
    }

    public void setInsurancePolicyNumber(String policy) {
        if (policy == null || policy.trim().isEmpty()) throw new IllegalArgumentException("Policy required");
        this.insurancePolicyNumber = policy;
    }

    public void setInsuranceRatePerDay(double insuranceRatePerDay) {
        if (insuranceRatePerDay < 0) throw new IllegalArgumentException("Insurance rate cannot be negative");
        this.insuranceRatePerDay = insuranceRatePerDay;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRatePerDay;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insured with policy: " + insurancePolicyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private double loadCapacity;
    private String insurancePolicyNumber;
    private double insuranceRatePerDay;

    public Truck(String number, double rate, double loadCapacity, String policy, double insuranceRatePerDay) {
        super(number, "Truck", rate);
        this.loadCapacity = loadCapacity;
        setInsurancePolicyNumber(policy);
        setInsuranceRatePerDay(insuranceRatePerDay);
    }

    public void setInsurancePolicyNumber(String policy) {
        if (policy == null || policy.trim().isEmpty()) throw new IllegalArgumentException("Policy required");
        this.insurancePolicyNumber = policy;
    }

    public void setInsuranceRatePerDay(double insuranceRatePerDay) {
        if (insuranceRatePerDay < 0) throw new IllegalArgumentException("Insurance rate cannot be negative");
        this.insuranceRatePerDay = insuranceRatePerDay;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRatePerDay;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insured with policy: " + insurancePolicyNumber;
    }
}
