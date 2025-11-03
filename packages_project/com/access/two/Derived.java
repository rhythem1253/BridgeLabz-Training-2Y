package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        System.out.print("Accessible from subclass in different package: ");
        // public and protected are accessible
        publicMethod();
        protectedMethod();
        // defaultMethod(); // not accessible - package-private
        // privateMethod(); // not accessible
        System.out.println("\nCannot call defaultMethod or privateMethod from subclass in different package.");
    }
}
