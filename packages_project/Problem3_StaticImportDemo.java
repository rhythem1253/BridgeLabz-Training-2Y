import static java.lang.Math.*;

/*
Demonstrates use of static import for Math.*
Uses sqrt(), pow(), max(), min(), abs().
*/
public class Problem3_StaticImportDemo {
    public static void main(String[] args) {
        double a = -9;
        double b = 16;
        System.out.println("abs(a) = " + abs(a));
        System.out.println("sqrt(b) = " + sqrt(b));
        System.out.println("pow(2,3) = " + pow(2,3));
        System.out.println("max(10,20) = " + max(10,20));
        System.out.println("min(10,20) = " + min(10,20));
    }
}
