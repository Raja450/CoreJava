package com;


class Student implements Comparable<Student>
{
	private String name;
	private int gpa;
	private int regNo;
	
	//Constructor
	public Student(String name, int gpa, int regNo) {
		this.name = name;
		this.gpa = gpa;
		this.regNo = regNo;
	}
	
    //Override the comapareTo() method
	@Override
	public int compareTo(Student other)
	{
		return (int)(this.getGpa() - other.getGpa());//compare using GPA
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
}

public class ComparableConcept {
	public static void main(String[] args)
	{
		Student s1 = new Student("Raja", 9, 101);
		Student s2 = new Student("Bikash", 7, 102);
		
		int comparisonResult = s1.compareTo(s2);
		
		if(comparisonResult > 0)
			System.out.println(s1.getName() + " has higher GPA");
		
		else if(comparisonResult < 0)
			System.out.println(s2.getName() + " has higher GPA");
		
		else
			System.out.println(s1.getName() + " and "+ s2.getName() + " have same GPA");
	}
	
	
			}  
