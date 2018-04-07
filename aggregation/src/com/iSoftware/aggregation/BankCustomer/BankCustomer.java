package com.iSoftware.aggregation.BankCustomer;

import java.util.Date;

public class BankCustomer {

	String firstName;
	String lastName;
	Date dateOfBirth;
	String idType;
	String acctType;// Saving or Checking
	String acctNumber;
	double acctBalance;
	String bankingCenterName;
	String cityOfBankingCenter;
	Address Address;
	String contactNumber;
	String email;

	public void displayPersonalDetails() {
		// Add code to display personal details like lastName,firstName & etc
	}

	public void displayBankDetails() {
		// Add code to display bank details
	}

	public void displayAccountDetails() {
		// Add code to display account details of customer
		
	}

	public void displayAdress() {
		// Add code to display address of customer
		System.out.println(Address.addressLocation+" "+Address.addressCity+" "+Address.addressCountry+" "+Address.pinCode); 
	}

}


