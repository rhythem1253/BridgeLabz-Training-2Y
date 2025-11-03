abstract class VehicleRide {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.trim().isEmpty()) throw new IllegalArgumentException("Invalid vehicleId");
        this.vehicleId = vehicleId;
    }

    public void setDriverName(String driverName) {
        if (driverName == null || driverName.trim().isEmpty()) throw new IllegalArgumentException("Invalid driver name");
        this.driverName = driverName;
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm < 0) throw new IllegalArgumentException("Rate cannot be negative");
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return "VehicleId: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class CarRide extends VehicleRide implements GPS {
    private String currentLocation;

    public CarRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class BikeRide extends VehicleRide implements GPS {
    private String currentLocation;

    public BikeRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // cheaper
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class AutoRide extends VehicleRide implements GPS {
    private String currentLocation;

    public AutoRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // different pricing
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
