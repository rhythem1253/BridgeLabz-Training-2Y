package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class MainAnalyzer {
    public static void main(String[] args) {
        Student s = new Student("Neha", 85, 78, 92);
        double avg = Analyzer.calculateAverage(s);
        String grade = Analyzer.findGrade(avg);
        System.out.println(s);
        System.out.println("Average: " + avg + " Grade: " + grade);
    }
}
