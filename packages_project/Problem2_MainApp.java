import com.university.department.cse.Course;

/*
Folder structure when compiled/run:
You should place the source under com/university/department/cse/Course.java
Compile from project root:
    javac com/university/department/cse/Course.java Problem2_MainApp.java
Run:
    java Problem2_MainApp
(Alternatively compile both then run.)
*/
public class Problem2_MainApp {
    public static void main(String[] args) {
        Course c = new Course("CSE101", "Intro to Computer Science");
        c.printCourseDetails();
    }
}
