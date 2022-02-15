package com.bankss;

public interface KVBBank extends LVBBank {

	@Override
	default void savings() {
		System.out.println("KVBBank savings is 8%");
		
	}
	@Override
	default void deposit() {
		System.out.println("KVBBank deposit is 10%");
		
	}
	
	
	
	
	
	
}
