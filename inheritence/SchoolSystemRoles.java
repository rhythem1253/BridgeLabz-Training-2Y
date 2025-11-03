class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    void displayRole() {
        System.out.println("Student in grade " + grade);
    }
}

class Staff extends Person {
    String department;

    void displayRole() {
        System.out.println("Staff in department " + department);
    }
}
