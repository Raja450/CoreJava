package com;

public class Constructor {
	int x, y;

	public Constructor(int a, int b) {
		x = a;
		y = b;
		System.out.println("Addition Of Two Numbers");
		System.out.println(x + y);

	}

	public static void main(String[] args) {
		Constructor r = new Constructor(10, 20);
	}

}
