package com;

import java.util.Scanner;

class InsufficientFund extends Throwable {

}

public class Throw {
    public static void main(String[] args) {
        int balance = 500;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amount = s.nextInt();
        if (balance > amount) {
            System.out.println("Please Collect the cash");
        } else {
            try {
                throw new InsufficientFund();
            } catch (InsufficientFund e) {
                System.out.println(e);
            }
            System.out.println("Low Balance");
        }
    }

}