import java.util.List;

public class Problem16_ResumeScreening {
    public static abstract class JobRole {}
    public static class SoftwareEngineer extends JobRole {}
    public static class DataScientist extends JobRole {}
    public static class ProductManager extends JobRole {}

    public static class Resume<T extends JobRole> {
        private String name;
        private T role;
        public Resume(String name, T role){ this.name = name; this.role = role; }
        public String toString(){ return name + " -> " + role.getClass().getSimpleName(); }
    }

    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) System.out.println("Screening role: " + r.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Bob", new DataScientist());
        System.out.println(r1);
        System.out.println(r2);

        List<JobRole> roles = java.util.Arrays.asList(new SoftwareEngineer(), new ProductManager());
        screenResumes(roles);
    }
}
