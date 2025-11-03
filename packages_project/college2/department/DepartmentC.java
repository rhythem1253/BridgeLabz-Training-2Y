package college.department;

public class Department {
    private String name;
    private String hod;

    public Department(String name, String hod) {
        this.name = name; this.hod = hod;
    }

    public String toString() {
        return "Department: " + name + " HOD: " + hod;
    }
}
