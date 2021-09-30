package com;

class Parent {
    int number = 264;

    void display() {
        // use of this keyword
        System.out.println("value of this " + this.number);

    }
}

/* sub class childClass extending parentClass */
class Child extends Parent {
    int number = 183;

    void show() {
        // printing the number without use of super keyword
        System.out.println("Value of Num in child class without use of super keyword: " + number);

        // printing the number with use of super keyword
        System.out.println("Value of Num in parent class with use of super keyword: " + super.number);
        // printing the number with the use of this keyword
        System.out.println(" use of this keywod:" + this.number);
    }
}

public class ThisSuper {
    public static void main(String[] args) {

        Parent b = new Parent();
        b.display();
        Child a = new Child();

        a.show();
    }
}