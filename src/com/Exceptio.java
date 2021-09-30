package com;

public class Exceptio {
    public static void main(String[] args) {
        try {
            String x = "10.3";
            float num = Float.parseFloat(x);
            System.out.println(num);
            String y = "Raja";
            int num1 = Integer.parseInt(y); // Number Format Exception Happen
            System.out.println(num1);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(100);
    }
}