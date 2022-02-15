package com.bankss;

public interface ICICIBank extends IOBBank {

	@Override
	default void savings() {
		System.out.println("savings in ICICIBank is 12%");
		IOBBank.super.savings();
	}
	@Override
	default void deposit() {
		System.out.println("deposit in ICICIBank is 9%");
		IOBBank.super.deposit();
	}
	
		
		
	
	
	
	
	
}
