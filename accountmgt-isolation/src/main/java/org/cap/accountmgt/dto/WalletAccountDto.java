package org.cap.accountmgt.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class WalletAccountDto
{
	
	private int accountId;
	private double accountBalance;
	enum status{
		active,
		not_active
		};
/*	
List<WalletTransaction> transactionHistory;

public List<WalletTransaction> getTransactionHistory() {
	return transactionHistory;
}
public void setTransactionHistory(List<WalletTransaction> transactionHistory) {
	this.transactionHistory = transactionHistory;
}*/
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public WalletAccountDto()
{
	
}

public WalletAccountDto(int accountId,double accountBalance)
{
	this.accountId=accountId;
	this.accountBalance=accountBalance;
	
}

}