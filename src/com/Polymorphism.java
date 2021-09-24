package com;

public class Polymorphism {
	// compile time
	public void test() {
		System.out.println("hello");
	}

	public void test(int x) {
		System.out.println(x);
	}

	public void test(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Polymorphism p1 = new Polymorphism();
		p1.test();
		p1.test(45);
		p1.test(470, 880);
	}

}