import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // CREATE operation
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (id, name, gpa) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setDouble(3, student.getGpa());
            pstmt.executeUpdate();
            System.out.println("Student added successfully: " + student.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ operation (Read All)
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT id, name, gpa FROM students";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double gpa = rs.getDouble("gpa");
                students.add(new Student(id, name, gpa));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    // UPDATE operation
    public void updateStudentGpa(int id, double newGpa) {
        String sql = "UPDATE students SET gpa = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, newGpa);
            pstmt.setInt(2, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student ID " + id + " updated successfully.");
            } else {
                System.out.println("Student ID " + id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE operation
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student ID " + id + " deleted successfully.");
            } else {
                System.out.println("Student ID " + id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 5) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student GPA");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter GPA: ");
                            double gpa = scanner.nextDouble();
                            scanner.nextLine();
                            dbManager.addStudent(new Student(id, name, gpa));
                            break;
                        case 2:
                            System.out.println("\n--- All Students ---");
                            List<Student> students = dbManager.getAllStudents();
                            students.forEach(System.out::println);
                            break;
                        case 3:
                            System.out.print("Enter Student ID to update: ");
                            int updateId = scanner.nextInt();
                            System.out.print("Enter New GPA: ");
                            double newGpa = scanner.nextDouble();
                            scanner.nextLine();
                            dbManager.updateStudentGpa(updateId, newGpa);
                            break;
                        case 4:
                            System.out.print("Enter Student ID to delete: ");
                            int deleteId = scanner.nextInt();
                            scanner.nextLine();
                            dbManager.deleteStudent(deleteId);
                            break;
                        case 5:
                            System.out.println("Exiting system. Goodbye.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input type. Please enter the correct format.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
