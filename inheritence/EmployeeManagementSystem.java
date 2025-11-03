class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Details");
    }
}

class Manager extends Employee {
    int teamSize;

    @Override
    void displayDetails() {
        System.out.println("Manager manages team of " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    @Override
    void displayDetails() {
        System.out.println("Developer codes in " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentor;

    @Override
    void displayDetails() {
        System.out.println("Intern mentored by " + mentor);
    }
}
