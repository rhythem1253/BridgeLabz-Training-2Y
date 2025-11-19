import java.util.List;

public class Problem14_CourseManagement {
    public static abstract class CourseType {}
    public static class ExamCourse extends CourseType {}
    public static class AssignmentCourse extends CourseType {}
    public static class ResearchCourse extends CourseType {}

    public static class Course<T extends CourseType> {
        private String title; private T type;
        public Course(String title, T type){ this.title = title; this.type = type; }
        public String toString(){ return title + " [" + type.getClass().getSimpleName() + "]"; }
    }

    public static void printCourses(List<? extends CourseType> types) {
        for (CourseType t : types) System.out.println("Course type: " + t.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Course<ExamCourse> c1 = new Course<>("Math 101", new ExamCourse());
        Course<ResearchCourse> c2 = new Course<>("Thesis", new ResearchCourse());
        System.out.println(c1);
        System.out.println(c2);
        // Demonstrate wildcard usage with course types list
        List<CourseType> list = java.util.Arrays.asList(new ExamCourse(), new ResearchCourse());
        printCourses(list);
    }
}
