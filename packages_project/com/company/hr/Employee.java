package com.company.hr;

public class Employee {
    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("salary negative");
        this.salary = salary;
    }

    public String toString() {
        return name + " (" + id + ") Dept: " + department + " Salary: " + salary;
    }
}
