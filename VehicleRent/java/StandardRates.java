package com.VehicleRent.java;

public enum StandardRates {
	ratePerKMPetrol(9), BusDiscount(0.02),ratePerKMDiesel(8),AcCharge(2);
	private int rate;
	double busDiscount;

	StandardRates(int rate) {
		this.rate = rate;

	}

	StandardRates(double busDiscount) {
		this.busDiscount = busDiscount;
	}

	int getRate() {
		return rate;
	}

	double getBusDiscount() {
		return busDiscount;
	}
}
