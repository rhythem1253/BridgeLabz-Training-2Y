package com.access.one;

public class Base {
    public void publicMethod() { System.out.println("publicMethod"); }
    protected void protectedMethod() { System.out.println("protectedMethod"); }
    void defaultMethod() { System.out.println("defaultMethod"); }
    private void privateMethod() { System.out.println("privateMethod"); }

    // helper to show private method usage inside same class
    public void callPrivate() { privateMethod(); }
}
