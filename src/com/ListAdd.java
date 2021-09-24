package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;

public class ListAdd {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "world", "Raja", "18");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}