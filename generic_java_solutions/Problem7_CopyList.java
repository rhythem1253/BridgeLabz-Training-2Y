import java.util.List;

public class Problem7_CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> dest = new java.util.ArrayList<>();
        List<Integer> src = java.util.Arrays.asList(10,20,30);
        copyList(dest, src);
        System.out.println("Dest after copy: " + dest);
    }
}
