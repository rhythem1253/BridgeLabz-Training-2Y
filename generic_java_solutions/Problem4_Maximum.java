public class Problem4_Maximum {
    // Works for Comparable types (including Numbers that implement Comparable)
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max int: " + maximum(3, 7, 5));
        System.out.println("Max double: " + maximum(3.2, 1.5, 2.9));
        System.out.println("Max string: " + maximum("apple", "banana", "pear"));
    }
}
