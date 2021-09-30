package com;

public class SwitchExample {


    public static void main(String[] args) {
        // Declaring a variable for switch expression
        char direction = 'N';
        char west = 'w';
        // Switch expression
        switch (direction) {
            // Case statements
            case 'N':
                System.out.println("North");
                break;
            case 'E':
                System.out.println("East");
                break;
            case 'w':
                System.out.println("West");
                break;

                // Default case statement
            default:
                System.out.println("Not ");
        }
    }
}