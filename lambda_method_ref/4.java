
// 4. Method Reference - Print Patient IDs

import java.util.*;

public class Four {
    public static void printId(String id){
        System.out.println(id);
    }

    public static void main(String[] args){
        List<String> ids = Arrays.asList("P101","P102","P103");
        ids.forEach(Four::printId);
    }
}
