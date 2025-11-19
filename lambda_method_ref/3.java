
// 3. Notification Filtering using Predicate

import java.util.*;
import java.util.function.Predicate;

public class Three {
    public static void main(String[] args){
        List<String> alerts = Arrays.asList("High BP", "Low Sugar", "Normal Checkup", "Emergency", "Low BP");

        Predicate<String> onlyCritical = msg -> msg.contains("High") || msg.contains("Emergency");

        alerts.stream()
              .filter(onlyCritical)
              .forEach(System.out::println);
    }
}
