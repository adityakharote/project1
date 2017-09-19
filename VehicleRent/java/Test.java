package com.VehicleRent.java;

public class Test {
	public static void main(String args[]) {

		int ratePerKM, distance, totalJourneyRent;

		// getting total rent for bus
		Bus bus = new Bus("tata skyline", "ac");
		distance = Journey.getDistance("Mumbai-Bangalore");
		ratePerKM = Journey.getRatePerKM(bus);
		totalJourneyRent = Utility.calculateRent(bus, ratePerKM, distance);
		System.out.println("Trip: " + bus.getModel() + ", " + bus.getAc() + ", " + "Mumbai-Bangalore");
		System.out.println("Total expense: " + totalJourneyRent);

		// getting total rent for XUV
		SUV suv = new SUV("Mahindara XUV 500");
		distance = Journey.getDistance("Mumbai-Bangalore");
		ratePerKM = Journey.getRatePerKM(suv);
		totalJourneyRent = Utility.calculateRent(suv, ratePerKM, distance);
		System.out.println("Trip: " + suv.getModel()  + ", " + "Mumbai-Bangalore");
		System.out.println("Total expense: " + totalJourneyRent);
		
		// getting total rent for car
		Car car=new Car("swift","diesel","non-ac");
		distance = Journey.getDistance("Pune-Mumbai");
		ratePerKM = Journey.getRatePerKM(car);
		totalJourneyRent = Utility.calculateRent(car, ratePerKM, distance);
		System.out.println("Trip: " + car.getModel()  + ", " + car.getFuelType()+", "+car.getAc()+", "+"Pune-Mumbai");
		System.out.println("Total expense: " + totalJourneyRent);
		
		
		
	}

}