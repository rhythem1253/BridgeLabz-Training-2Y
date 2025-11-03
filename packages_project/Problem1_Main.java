import college.student.Student;
import college.faculty.Faculty;

/*
Problem 1 main class (default package).
Demonstrates importing and using two user-defined packages.
*/
public class Problem1_Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Faculty f = new Faculty("Dr. Rao", "Mathematics");

        s.displayStudent();
        f.displayFaculty();
    }
}
