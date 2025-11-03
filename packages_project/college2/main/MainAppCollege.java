package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
import static java.lang.System.out;

/*
Mini project main: demonstrates import and static import (System.out).
*/
public class MainAppCollege {
    public static void main(String[] args) {
        Student s = new Student("S01", "Aman");
        Faculty f = new Faculty("F01", "Dr. Sen", "Physics");
        Department d = new Department("Physics", "Dr. Sen");

        out.println("College Information:");
        out.println(s);
        out.println(f);
        out.println(d);
    }
}
