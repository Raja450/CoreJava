package com;

public class BreakCon {
	public static void main(String[] args) {
		int i, n = 10;
		for (i = 1; i <= n; i++) {
			if (i == 8) {
				break;
			}
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
