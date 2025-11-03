package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;

/*
Demonstrates single-type imports. Also could use on-demand imports like:
import com.company.hr.*;

Folder structure must match package declarations.
*/
public class MainAppPayroll {
    public static void main(String[] args) {
        Employee e = new Employee("E01", "Vikram", "Engineering", 50000);
        Payroll p = new Payroll();
        double newSalary = p.calculateBonus(e);
        System.out.println("Before: " + e);
        System.out.println("After bonus salary: " + newSalary);
    }
}
