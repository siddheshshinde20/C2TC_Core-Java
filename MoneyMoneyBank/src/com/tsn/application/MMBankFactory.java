package com.tsn.application;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankFactory;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(AccNo, accNm, accBal, isSalaried) {
		 
		return MMSavingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(AccNo, accNm, accBal, creditLimit) {
		
		return MMCurrentAcc;
	}
    

}
