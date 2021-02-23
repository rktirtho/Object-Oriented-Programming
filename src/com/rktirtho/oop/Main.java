package com.rktirtho.oop;


public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("bz-300", "Toyata","Bule", 50000, 10, 4, 1000, 2020);
		
		Car car2 = new Car("XX-300", "BWM","Red", 300000, 15,2, 1500, 2018);
		Car car3 = car2;


		System.out.println(car1.brand);
		System.out.println(car1.model);
		

		System.out.println(car2.brand);
		System.out.println(car2.model);


		System.out.println(car2 == car3);
		
		
		
		
		
		

	}

}
