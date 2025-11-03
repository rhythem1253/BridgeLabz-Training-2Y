package app;

import college.student.StudentMod;

/*
To compile and run (Java 9+ modular):
From project root create module directories as shown.
Compile:
javac -d out/module_collegeinfo module_collegeinfo/college/student/StudentMod.java module_collegeinfo/module-info.java
javac -d out/module_app --module-path out module_app/app/MainAppModule.java module_app/module-info.java
Run:
java --module-path out -m app/app.MainAppModule
*/
public class MainAppModule {
    public static void main(String[] args) {
        StudentMod s = new StudentMod("ModUser", 500);
        s.display();
    }
}
