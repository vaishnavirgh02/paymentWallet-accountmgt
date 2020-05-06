package org.cap.accountmgt.service;

import com.capg.wallet.usermgt.entities.WalletAccount;
import com.capg.wallet.usermgt.entities.WalletUser;

public interface IWalletAccountService {

	
	WalletAccountDto addAmount(WalletUser user, double amount);
	WalletAccountDto deductAmount(WalletUser user, double amount);
	void transferfund(WalletUser sender,WalletUser receiver,double amount);
}
