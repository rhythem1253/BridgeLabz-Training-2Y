import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percentage = total / 5.0;
        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else grade = 'D';
        System.out.println("Percentage: " + percentage + "% Grade: " + grade);
        sc.close();
    }
}
