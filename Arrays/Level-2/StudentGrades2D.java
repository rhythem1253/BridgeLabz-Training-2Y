import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[2][5]; // 2 students, 5 subjects
        for (int i = 0; i < 2; i++) {
            int total = 0;
            System.out.println("Enter marks for student " + (i+1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j+1) + ": ");
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }
            double percentage = total / 5.0;
            char grade;
            if (percentage >= 90) grade = 'A';
            else if (percentage >= 75) grade = 'B';
            else if (percentage >= 50) grade = 'C';
            else grade = 'D';
            System.out.println("Student " + (i+1) + " Percentage: " + percentage + "% Grade: " + grade);
        }
        sc.close();
    }
}
