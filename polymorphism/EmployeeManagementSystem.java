abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("Base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlyAllowance;

    public FullTimeEmployee(int id, String name, double baseSalary, double monthlyAllowance) {
        super(id, name, baseSalary);
        setMonthlyAllowance(monthlyAllowance);
    }

    public double getMonthlyAllowance() { return monthlyAllowance; }
    public void setMonthlyAllowance(double monthlyAllowance) {
        if (monthlyAllowance < 0) throw new IllegalArgumentException("Allowance cannot be negative");
        this.monthlyAllowance = monthlyAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyAllowance;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    public int getHoursWorked() { return hoursWorked; }
    public double getHourlyRate() { return hourlyRate; }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) throw new IllegalArgumentException("Hours cannot be negative");
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("Hourly rate cannot be negative");
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
