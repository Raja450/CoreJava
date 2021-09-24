package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompareUsingGPA implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getGpa() - s2.getGpa();
	}
}

class CompareUsingName implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());// the compareTo() method is already defined
													// for strings so we can directly use it
	}
}

class CompareUsingRegNo implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getRegNo() - s2.getRegNo();
	}
}

public class Comparattor {
	public static void main(String[] args) {
		Student s1 = new Student("Raja", 8, 101);
		Student s2 = new Student("Bikash", 7, 102);
		Student s3 = new Student("Deepak", 5, 103);
		Student s4 = new Student("Bishal", 6, 104);
		Student s5 = new Student("Rahul", 9, 105);

		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);

		System.out.println("Intial unsorted list:");
		for (Student s : listOfStudents)
			System.out.println(s.getName() + " " + s.getRegNo() + " " + s.getGpa());

		// Sorting Using GPA
		CompareUsingGPA c1 = new CompareUsingGPA();
		Collections.sort(listOfStudents, c1);
		System.out.println("\nSorting using GPA");

		for (Student s : listOfStudents)
			System.out.println(s.getName() + " " + s.getRegNo() + " " + s.getGpa());

		// Sorting Using Names
		CompareUsingName c2 = new CompareUsingName();
		Collections.sort(listOfStudents, c2);
		System.out.println("\nSorting using Name");

		for (Student s : listOfStudents)
			System.out.println(s.getName() + " " + s.getRegNo() + " " + s.getGpa());

		// Sorting Using Registration Number
		CompareUsingRegNo c3 = new CompareUsingRegNo();
		Collections.sort(listOfStudents, c3);
		System.out.println("\nSorting using Registration Numbers");

		for (Student s : listOfStudents)
			System.out.println(s.getName() + " " + s.getRegNo() + " " + s.getGpa());
	}

}
