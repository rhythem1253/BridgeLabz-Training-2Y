class Device {
    String deviceId;
    String status;

    void displayStatus() {
        System.out.println("Device status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    @Override
    void displayStatus() {
        System.out.println("Thermostat set to: " + temperatureSetting);
    }
}
