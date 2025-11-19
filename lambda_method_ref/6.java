
// 6. Constructor Reference - Invoice Creation

import java.util.*;
import java.util.stream.*;

class Invoice {
    String id;
    Invoice(String id){
        this.id=id;
        System.out.println("Invoice created for: "+id);
    }
}

public class Six {
    public static void main(String[] args){
        List<String> ids = Arrays.asList("TXN1","TXN2","TXN3");

        List<Invoice> invoices =
                ids.stream()
                   .map(Invoice::new)
                   .collect(Collectors.toList());
    }
}
