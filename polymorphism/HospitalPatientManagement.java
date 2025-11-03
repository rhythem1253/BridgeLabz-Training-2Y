abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        setPatientId(patientId);
        setName(name);
        setAge(age);
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setPatientId(String patientId) {
        if (patientId == null || patientId.trim().isEmpty()) throw new IllegalArgumentException("Invalid patientId");
        this.patientId = patientId;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public String getPatientDetails() {
        return "PatientId: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int daysAdmitted;
    private StringBuilder records = new StringBuilder();

    public InPatient(String id, String name, int age, double roomChargePerDay, int daysAdmitted) {
        super(id, name, age);
        setRoomChargePerDay(roomChargePerDay);
        setDaysAdmitted(daysAdmitted);
    }

    public void setRoomChargePerDay(double c) {
        if (c < 0) throw new IllegalArgumentException("Charge cannot be negative");
        this.roomChargePerDay = c;
    }

    public void setDaysAdmitted(int d) {
        if (d < 0) throw new IllegalArgumentException("Days cannot be negative");
        this.daysAdmitted = d;
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder records = new StringBuilder();

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        setConsultationFee(consultationFee);
    }

    public void setConsultationFee(double f) {
        if (f < 0) throw new IllegalArgumentException("Fee cannot be negative");
        this.consultationFee = f;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}
