package com;

public class Finally {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the finally block");
        }
    }
}