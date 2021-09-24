package com;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[] a = { 5, 2, 7, 9, 6, 7, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number of the Element");
		int value = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				System.out.println(i);
			}
		}
	}

}
