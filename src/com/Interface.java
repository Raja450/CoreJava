package com;

interface Animal {
    void run();

    void sleep();

}

interface Tiger {
    void walk();
}

class Lion implements Animal, Tiger {

    @Override
    public void run() {
        System.out.println("speed 100Kmph");

    }

    @Override
    public void walk() {
        System.out.println("slowly");

    }

    @Override
    public void sleep() {
        System.out.println("sleep 8 hours");

    }

}

public class Interface extends Lion {
    public static void main(String[] args) {
        Interface i1 = new Interface();
        i1.run();
        i1.walk();
        i1.sleep();
    }

}