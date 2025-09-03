import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] years = new int[10];
        double[] salary = new double[10];
        double[] bonus = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            years[i] = sc.nextInt();
            
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = 0;
        }

        System.out.println("\nEmployee Bonuses:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Bonus = " + bonus[i]);
        }
        sc.close();
    }
}
