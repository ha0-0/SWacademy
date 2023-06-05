package com.java.inheritance;

public class Main {

	public static void main(String[] args) {

		Car car = new FireEngine();
		
		System.out.println(car.getAccelate());

		car.speedUp();
		car.speedUp();

		System.out.println(car.getAccelate());
		
//		car.shower();
//		car.shower();
//
//		System.out.println(car.getWater());
	}

}
