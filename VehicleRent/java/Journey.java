package com.VehicleRent.java;

import java.util.HashMap;

public class Journey {
	public static int getDistance(String journey) {
		HashMap<String, Integer> journeyDistance = new HashMap<String, Integer>();
		String[] splitedJourney = journey.split("-");
		String fromCity = splitedJourney[0];
		String toCity = splitedJourney[1];
		for (CityDistances di : CityDistances.values()) {
			journeyDistance.put(di.toString(), di.getDistance());
		}
		int distance = journeyDistance.get(fromCity) + journeyDistance.get(toCity);

		return distance;

	}

	public static int getRatePerKM(Vehicle vehicle) {
		int ratePerKM = 0;
		int ratePerKMPetrol = StandardRates.ratePerKMPetrol.getRate();
		int ratePerKMDiesel = StandardRates.ratePerKMDiesel.getRate();
		int acCharge = StandardRates.AcCharge.getRate();
		if (vehicle.getFuelType().equalsIgnoreCase("petrol")) {
			if (vehicle.getAc().equalsIgnoreCase("NON-AC")) {
				ratePerKM = ratePerKMPetrol;
			} else {
				ratePerKM = ratePerKMPetrol + acCharge;
			}
		} else {
			if (vehicle.getAc().equalsIgnoreCase("NON-AC")) {

				ratePerKM = ratePerKMDiesel;
			} else {
				ratePerKM = ratePerKMDiesel + acCharge;
			}

		}
		return ratePerKM;

	}
}