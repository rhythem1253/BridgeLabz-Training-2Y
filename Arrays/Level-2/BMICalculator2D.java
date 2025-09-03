import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[5][2]; // [height, weight]

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            double bmi = data[i][1] / (data[i][0] * data[i][0]);
            System.out.print("Person " + (i+1) + " BMI = " + bmi + " Status: ");
            if (bmi < 18.5) System.out.println("Underweight");
            else if (bmi < 24.9) System.out.println("Normal");
            else if (bmi < 29.9) System.out.println("Overweight");
            else System.out.println("Obese");
        }
        sc.close();
    }
}
