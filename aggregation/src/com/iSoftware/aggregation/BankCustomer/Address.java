package com.iSoftware.aggregation.BankCustomer;

public class Address {
	String addressLocation;
	String addressCity;
	String addressCountry;
	long pinCode;

	public Address(String addressLocation, String addressCity, String addressCountry, long pinCode) {
		this.addressLocation = addressLocation;
		this.addressCity = addressCity;
		this.addressCountry = addressCountry;
		this.pinCode = pinCode;
	}
}
