package com.tsn.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}
