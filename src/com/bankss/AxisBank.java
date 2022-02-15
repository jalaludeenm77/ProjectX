package com.bankss;

public class AxisBank extends BOBBank {

	@Override
	public void savings() {
		System.out.println("savings in AxisBank is 5%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("deposit in Axis Bank is 6%");
		super.deposit();
	}
	
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.savings();
		a.deposit();
		
		
		
		
	}
	
	
}
