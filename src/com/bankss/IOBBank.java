package com.bankss;

public interface IOBBank extends KVBBank {

	@Override
	default void savings() {
		System.out.println("savings in IOBBank is 6%");
		KVBBank.super.savings();
	}
	@Override
	default void deposit() {
		System.out.println("deposit in IOBBank is 9%");
		KVBBank.super.deposit();
	}
	
	
	
	
	
}
