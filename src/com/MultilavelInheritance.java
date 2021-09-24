package com;

class C

{
	int z;

	public void test1(int x, int y) {
		z = x * y;

	}
}

class D extends C {

	public void test2(int x, int y) {

		z = x + y;
		System.out.println("sum of two number " + z);

	}
}

public class MultilavelInheritance extends D {
	public static void main(String[] args) {
		int a = 10, b = 20;
		MultilavelInheritance a1 = new MultilavelInheritance();

		a1.test1(a, b);
		System.out.println("Multipication of two number  " + a1.z);

		a1.test2(a, b);
		System.out.println("Multipication of two number  " + a1.z);
	}

}