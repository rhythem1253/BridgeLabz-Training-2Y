public class Problem3_IsEqual {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) return b == null;
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 5)); // true
        System.out.println(isEqual("hi", "hello")); // false
        System.out.println(isEqual(null, null)); // true
    }
}
