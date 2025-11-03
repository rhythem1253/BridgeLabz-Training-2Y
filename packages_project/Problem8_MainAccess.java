import com.access.two.Derived;
import com.access.one.Base;

/*
Demonstrates which access modifiers are accessible across packages.
A small table is printed as comment and also we show runtime calls.
*/
public class Problem8_MainAccess {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();

        Base b = new Base();
        b.publicMethod();
        // b.protectedMethod(); // not accessible via reference of Base in different package
        // b.defaultMethod(); // not accessible
        // b.callPrivate(); // works to call private inside same class via public helper
        System.out.println("\nSummary (accessible from other package, non-subclass instance):");
        System.out.println("public: yes, protected: no, default: no, private: no");
        System.out.println("(From subclass in other package: public: yes, protected: yes, default: no, private: no)"); 
    }
}
