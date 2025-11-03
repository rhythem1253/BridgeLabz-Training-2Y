package college.faculty;

public class Faculty {
    private String id;
    private String name;
    private String dept;

    public Faculty(String id, String name, String dept) {
        this.id = id; this.name = name; this.dept = dept;
    }

    public String toString() {
        return "Faculty[" + id + "] " + name + " Dept:" + dept;
    }
}
