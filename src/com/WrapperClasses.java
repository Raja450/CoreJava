package com;

public class WrapperClasses {
	public static void main(String args[]) {
		// object1 is equals object2
		Integer value1 = new Integer(100);
		Integer value2 = new Integer(100);
		int check = value1.compareTo(value2);
		System.out.println(check);

		// object1 is less than object2
		Integer a = new Integer(120);
		Integer b = new Integer(150);
		int check1 = a.compareTo(b);
		System.out.println(check1);

		// object1 is greater than object2
		Integer c = new Integer(200);
		Integer d = new Integer(100);
		int check2 = c.compareTo(d);
		System.out.println(check2);
	}
}