package com.VehicleRent.java;

public class Utility {
	public static int calculateRent(Vehicle vehicle, int ratePerKM, int distance) {
		int totalJourneyRent = 0;
		if (vehicle instanceof Bus) {
			double discount =  StandardRates.BusDiscount.getBusDiscount();
			totalJourneyRent = (int) (distance *(ratePerKM - (ratePerKM * discount)));
		} else {
			totalJourneyRent = distance * ratePerKM;
		}
		return totalJourneyRent;
	}
}