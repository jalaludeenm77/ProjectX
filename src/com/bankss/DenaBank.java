package com.bankss;

public abstract class DenaBank extends DhanalaxsmiBank {

	@Override
	public void savings() {
		System.out.println("savings in Dena bank is 8%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("deposit in dena bank is 9%");
		super.deposit();
	}
	
	
	
	
	
}
