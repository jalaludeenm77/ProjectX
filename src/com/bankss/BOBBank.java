package com.bankss;

public class BOBBank extends CanaraBank {

	@Override
	public void savings() {
		System.out.println("BOBBank savings is 11%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("BOBBank deposit is 10%");
		super.deposit();
	}
	
	
	
	
}
