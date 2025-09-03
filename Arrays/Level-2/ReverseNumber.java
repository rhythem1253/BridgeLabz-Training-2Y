import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = new int[String.valueOf(num).length()];

        int i = 0;
        while (num > 0) {
            digits[i++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed number: ");
        for (int d : digits) {
            System.out.print(d);
        }
        System.out.println();
        sc.close();
    }
}
