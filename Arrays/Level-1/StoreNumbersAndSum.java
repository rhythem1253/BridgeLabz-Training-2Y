import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double n = sc.nextDouble();
            if (n <= 0 || index == 10) break;
            numbers[index] = n;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Sum = " + total);
        sc.close();
    }
}
