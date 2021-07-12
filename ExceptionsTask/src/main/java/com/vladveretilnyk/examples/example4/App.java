package com.vladveretilnyk.examples.example4;

//  finally-секция может «перебить» throw/return при помощи другого throw/return
public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
