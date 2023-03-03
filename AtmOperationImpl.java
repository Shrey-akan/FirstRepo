package com.atm;
import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface {
	ATM atm = new ATM();
	Map<Double, String> ministat = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is :"+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(atm.getBalance()>=withdrawAmount) {
			ministat.put(withdrawAmount , "Amount Withdrawl");
			System.out.println("Collect The Cash "+withdrawAmount );
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministat.put(depositAmount , "Amount Deposited");
		System.out.println(depositAmount+ "Deposited Successfully");
		atm.setBalance(atm.getBalance()+depositAmount);
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double , String> m:ministat.entrySet()) {
			System.out.println(m.getKey() + ""+ m.getValue());
		}
		
	}
	
}
