package org.cap.accountmgt.dao;


public interface IWalletAccountDao {
	
	
	WalletAccountDto addAmount(WalletUser user, double amount);
	WalletAccountDto deductAmount(WalletUser user, double amount);
	void transferfund(WalletUser sender,WalletUser receiver,double amount);

}