package college.student;

public class StudentMod {
    private String name;
    private int roll;

    public StudentMod(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }

    public void display() {
        System.out.println("Module Student: " + name + " (" + roll + ")");
    }
}
