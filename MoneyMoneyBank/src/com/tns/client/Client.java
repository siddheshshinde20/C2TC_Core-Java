package com.tns.client;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tsn.application.MMBankFactory;
import com.tsn.application.MMCurrentAcc;
import com.tsn.application.MMSavingAcc;

public class Client {
	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(1,"Siddhesh",1000000,true,5000);
		sa.withdraw(sa.getAccBal(), sa.getWithdrawAmt());
		sa.toString();
		CurrentAcc ca =new MMCurrentAcc(2,"Swapnil",500000,5000,4000);
		ca.withdraw(ca.getCreditLimit(),ca.getWithdrawAmt());
		ca.toString();
	}
}


