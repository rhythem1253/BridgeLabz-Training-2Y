package college.student;

public class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }

    public void displayStudent() {
        System.out.println("Student Name: " + name + ", Roll: " + roll);
    }
}
