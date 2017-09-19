package com.VehicleRent.java;

public enum CityDistances {
	Pune(0), Mumbai(200), Bangalore(1000), Delhi(2050), Chennai((int) 1234.5);
	 private int distance;

	CityDistances(int distance) {
		this.distance = distance;
	}

	int getDistance() {
		return distance;
	}
}