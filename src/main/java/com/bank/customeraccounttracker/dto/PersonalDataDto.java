package com.bank.customeraccounttracker.dto;

public class PersonalDataDto extends CustomerDetailsDto{
	private Long accountNumber;

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
}
