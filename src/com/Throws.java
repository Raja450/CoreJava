package com;

public class Throws {
    int division(int a, int b) throws ArithmeticException {
        int t = a / b;
        return t;
    }

    public static void main(String args[]) {
        Throws a1 = new Throws();
        try {
            System.out.println(a1.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("Number is not divided");
        }
    }
}