package com;

class Encapsulation {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Encapsule {
	public static void main(String[] args) {
		Encapsulation e1 = new Encapsulation();
		e1.setName("Raja Sah");
		e1.setAge(23);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
	}
}
