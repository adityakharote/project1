package com.VehicleRent.java;

public class Vehicle {
	String model;
	String fuelType; 
	String ac;

	public Vehicle(String model, String fuelType, String ac) {
		super();
		this.model = model;
		this.fuelType = fuelType;
		this.ac = ac;
	}

	public String getModel() {
		return model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public String getAc() {
		return ac;
	}

}