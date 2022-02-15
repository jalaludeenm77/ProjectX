package com.bankss;

public abstract class HDFCBank extends  HSBCBank {

	@Override
	public void savings() {
		System.out.println("savings in HDFC is 5%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("deposit in HDFC is 7%");
		super.deposit();
	}
	
	
	
	
	
}
