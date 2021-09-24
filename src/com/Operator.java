package com;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal, rate, time, emi;
		System.out.println("Enter  Principle");
		principal = sc.nextDouble();
		System.out.println("Enter the rate");
		rate = sc.nextDouble();
		System.out.println("Enter the time in Year");
		time = sc.nextDouble();
		rate = rate / (15 * 100);
		time = time * 12;
		emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
		System.out.print("Monthly EMI is= " + emi + "\n");

	}

}