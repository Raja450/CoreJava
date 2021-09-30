package com;

class H {
    H() {
        System.out.println("Constructor of class A");
    }
}
class I extends H {
    I() {
        System.out.println("Constructor of class B");
    }
}
class J extends H {
    J() {
        System.out.println("Constructor of class C");
    }
}
class K extends I {
    K() {
        System.out.println("Constructor of class D");
    }

}


public class HybridInheritance {
    public static void main(String[] args) {
        K d1 = new K();
    }

}