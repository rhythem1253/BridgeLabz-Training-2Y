
// 5. Method Reference - Name Uppercasing

import java.util.*;

public class Five {
    public static void main(String[] args){
        List<String> names=Arrays.asList("Arjun","Meera","Riya");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
