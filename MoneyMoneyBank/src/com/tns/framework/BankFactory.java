package com.tns.framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAccount(AccNo, accNm, accBal, isSalaried);{}
	public abstract CurrentAcc getNewCurrentAccount(AccNo, accNm, accBal, creditLimit);

}
