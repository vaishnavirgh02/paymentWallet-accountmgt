package org.cap.accountmgt.service;

import org.cap.accountmgt.dao.IWalletAccountDao;
import org.cap.accountmgt.entities.WalletAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class WalletAccountServiceImpl implements IWalletAccountService {

	 @Autowired
	private IWalletAccountDao accountDao;
	private IWalletTransactionDao transactionDao;

	public WalletAccountServiceImpl(IWalletAccountDao daoAccount, IWalletTransactionDao transDao) {
		this.accountDao = daoAccount;
		this.transactionDao = transDao;
	}

	


	@Override
	public WalletAccount addAmount(WalletUser user, double amount) {
		
		WalletAccount w = accountDao.addAmount(user, amount);
		transactionDao.addAmount(w, amount);
		return w;
	}

	@Override
	public WalletAccount deductAmount(WalletUser user, double amount) {

		WalletAccount w = accountDao.deductAmount(user, amount);
		transactionDao.deductAmount(w, amount);
		return w;
	}

	@Override
	public void transferfund(WalletUser sender,WalletUser receiver,double amount) {
		
		accountDao.transferfund(sender, receiver, amount);
	}

}
