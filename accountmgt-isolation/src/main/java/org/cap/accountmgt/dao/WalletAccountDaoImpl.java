package org.cap.accountmgt.dao;


import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class WalletAccountDaoImpl implements IWalletAccountDao {
	
	 private EntityManager entityManager;

	    public EntityManager getEntityManager() {
	        return entityManager;
	    }

	    @PersistenceContext // @Autowired
	    public void setEntityManager(EntityManager entityManager) {
	        this.entityManager = entityManager;
	    }

	public static Map<Integer, UserAndAccountDto> store = new HashMap<>();

	private int generatedId;

	public int generateId() {
		return ++generatedId;
	}


	@Override
	public WalletAccountDto addAmount(WalletUser user, double amount) {
		
		int userId=user.getUserId();
		UserAndAccountDto userAccount= store.get(userId);
		WalletAccountDto account=userAccount.getAccount();
		double balance=account.getAccountBalance();
		double newBalance=balance+amount;
		account.setAccountBalance(newBalance);
		return account;
	}

	@Override
	public WalletAccountDto deductAmount(WalletUser user, double amount) {
		int userId=user.getUserId();
		UserAndAccountDto userAccount= store.get(userId);
		WalletAccountDto account=userAccount.getAccount();
		double balance=account.getAccountBalance();
		double newBalance=balance-amount;
		account.setAccountBalance(newBalance);
		return account;
	}

	@Override
	public void transferfund(WalletUser sender,WalletUser receiver,double amount) {
		addAmount(receiver,amount);
		deductAmount(sender,amount);
	}
}
