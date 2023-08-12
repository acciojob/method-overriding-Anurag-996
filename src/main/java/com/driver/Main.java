package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String result = obj.meth();
        System.out.println(result);  // This line should work fine
    }

    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

}

