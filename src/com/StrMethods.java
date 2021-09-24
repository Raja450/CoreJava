package com;

public class StrMethods {
	public static void main(String[] args) {
		// charAt method()
		String name = "Raja Sah";
		char c = name.charAt(6);
		System.out.println(c);

		// compareTo method()
		String s1 = "raja";
		String s2 = "raja";
		String s3 = "";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));

		// concat method()
		String s4 = "Raja";
		String s5 = " Sah";
		String s6 = s4.concat(s5);
		System.out.println(s6);

		// equals method()
		String s7 = "Raja";
		String s8 = "Raja";
		System.out.println(s7.equals(s8));
		System.out.println(s7.equals(s5));

		// endswith method()
		System.out.println(s7.endsWith("a"));
		System.out.println(s7.endsWith("j"));

		// starswith()
		System.out.println(s7.startsWith("r"));
		System.out.println(s7.startsWith("R"));

		// uppercase()
		String s9 = s7.toUpperCase();
		System.out.println(s9);

		// lowercase()
		String s10 = s7.toLowerCase();
		System.out.println(s10);

	}

}