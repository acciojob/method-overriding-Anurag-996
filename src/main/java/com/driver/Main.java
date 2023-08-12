package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String result = obj.meth();
        System.out.println(result);  // This line should work fine
    }
}