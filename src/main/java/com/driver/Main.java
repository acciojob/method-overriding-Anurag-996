package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String result = obj.meth();
        System.out.println(result);  // This line should work fine
    }
}

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
