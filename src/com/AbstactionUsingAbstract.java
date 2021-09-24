package com;

//abstract class
abstract class Car {
	abstract void accelerate();
}

//concrete class
class Suzuki extends Car {
	void accelerate() {
		System.out.println("Suzuki::accelerate");

	}
}

public class AbstactionUsingAbstract {
	public static void main(String args[]) {
		Car obj = new Suzuki();
		obj.accelerate(); // call the method
	}
}
