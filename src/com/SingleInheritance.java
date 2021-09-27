package com;

//base class
class A {
	public void test() {
		System.out.println("Hello Base Class");
		int a = 10;
		int b = 20;
		System.out.println("Sum of two number " + (a + b));
	}
}

public class SingleInheritance extends A {
	public static void main(String[] args) {
		SingleInheritance a1 = new SingleInheritance();
		a1.test();
	}

}