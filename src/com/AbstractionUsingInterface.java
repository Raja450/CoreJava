package com;

interface Person {
    void dsplay();
}

class Employee implements Person {
    public void dsplay() {
        System.out.println("This is display method of the Employee class");
    }
}

class Hr implements Person {
    public void dsplay() {
        System.out.println("This is display method of the HR class");
    }
}

public class AbstractionUsingInterface {
    public static void main(String args[]) {
        Person person1 = new Employee();
        person1.dsplay();
        Person person2 = new Hr();
        person2.dsplay();
    }
}