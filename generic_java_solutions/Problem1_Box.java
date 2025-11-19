public class Problem1_Box {
    // Generic Box<T>
    public static class Box<T> {
        private T value;
        public void set(T value) { this.value = value; }
        public T get() { return value; }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer box: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String box: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(3.1415);
        System.out.println("Double box: " + dblBox.get());
    }
}
