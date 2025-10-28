
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() { this("", "Compact", 1); }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName; this.carModel = carModel; this.rentalDays = rentalDays;
    }

    public double totalCost() {
        double rate;
        if (carModel.equalsIgnoreCase("SUV")) rate = 90.0;
        else if (carModel.equalsIgnoreCase("Sedan")) rate = 70.0;
        else rate = 50.0;
        return rate * rentalDays;
    }
}
