package com;

class P {
    public void test1() {
        System.out.println(200);
    }

    public void test2() {
        System.out.println(500);
    }
}

public class RunTimePollymorphism extends P {
    @Override
    public void test1() {
        System.out.println(200);
    }

    public static void main(String[] args) {
        RunTimePollymorphism r1 = new RunTimePollymorphism();
        r1.test1();
        r1.test2();

    }
}