package com;


class X {
    public void display() {
        System.out.println("My name is raja ");
    }
}
class Y extends X {
    public void show() {
        System.out.println("Hello how are you");
    }
}
class Z extends X {
    public void hello() {
        System.out.println("Welcome to hello world");
    }
}

public class HirarchialInheritance {
    public static void main(String[] args) {
        Y y = new Y();
        Z z = new Z();
        y.display();
        y.show();
        z.display();
        z.hello();
    }

}