
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() { this("", "Standard", 1); }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName; this.roomType = roomType; this.nights = nights;
    }
    public HotelBooking(HotelBooking other) { this(other.guestName, other.roomType, other.nights); }

    public double totalCost() {
        double rate;
        if (roomType.equalsIgnoreCase("Suite")) rate = 250.0;
        else if (roomType.equalsIgnoreCase("Deluxe")) rate = 150.0;
        else rate = 100.0;
        return rate * nights;
    }
}
