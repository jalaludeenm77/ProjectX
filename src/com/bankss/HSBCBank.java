package com.bankss;

public abstract class HSBCBank implements ICICIBank {

	@Override
	public void savings() {
		System.out.println("savings in HSBCBank is 4%");
		ICICIBank.super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("deposit in HSBCBank is 3%");
		ICICIBank.super.deposit();
	}
	
	
	
	
	
}
