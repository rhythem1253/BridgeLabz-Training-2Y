package com.university.department.cse;

public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public void printCourseDetails() {
        System.out.println("Course: " + code + " - " + title);
    }
}
