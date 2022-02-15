package com.bankss;

public class CanaraBank extends CUBBank {

	@Override
	public void savings() {
		System.out.println("savings percent in Canara Bank is 4%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("deposit in CanaraBank is 8%");
		super.deposit();
	}
	
	
	
	
}
