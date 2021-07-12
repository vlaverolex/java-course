package com.vladveretilnyk.examples.example2;

//  catch — полиморфная конструкция, т.е. catch по типу Parent перехватывает летящие экземпляры любого типа, который является Parent-о
public class App {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
    }
}