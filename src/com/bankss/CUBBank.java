package com.bankss;

public class CUBBank extends DenaBank{
@Override
public void savings() {
	System.out.println("savings in CUBBank is 7%");
	super.savings();
}
@Override
	public void deposit() {
		System.out.println("deposit in CUBBank is 9%");
		super.deposit();
	}

	
	
}
