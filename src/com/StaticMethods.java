package com;

public class StaticMethods {
	// static variable
	static int num;
	static String str;
	static int x;
	// non static variable
	int z = 50;
	// static block
	static {
		num = 16;
		str = "Raja";

	}

	// static method
	public static void main(String[] args) {

		System.out.println("Value of num is:" + num);
		System.out.println("value of str is:" + str);
		System.out.println(x);
		StaticMethods a1 = new StaticMethods();
		System.out.println(a1.z);
	}

}