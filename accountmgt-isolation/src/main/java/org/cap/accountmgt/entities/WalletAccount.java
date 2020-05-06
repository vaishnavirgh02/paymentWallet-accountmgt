package org.cap.accountmgt.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="walletAccounts")
public class WalletAccount
{
	 @Id
	 @GeneratedValue
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
public WalletAccount()
{
	
}

public WalletAccount(int accountId,double accountBalance)
{
	this.accountId=accountId;
	this.accountBalance=accountBalance;
	
}

}