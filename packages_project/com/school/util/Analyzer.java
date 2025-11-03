package com.school.util;

import com.school.data.Student;

public class Analyzer {
    public static double calculateAverage(Student s) {
        return (s.getM1() + s.getM2() + s.getM3()) / 3.0;
    }

    public static String findGrade(double avg) {
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        return "F";
    }
}
