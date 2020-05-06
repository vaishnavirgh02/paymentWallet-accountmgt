package org.cap.accountmgt.dto;

import org.cap.accountmgt.entities.WalletAccount;

public class UserAndAccountDto {
	

	private WalletUser user;
	private WalletAccount account;
	
	public WalletAccount getAccount() {
		return account;
	}

	public void setAccount(WalletAccount account) {
		this.account = account;
	}

	public WalletUser getUser() {
		return user;
	}

	public void setUser(WalletUser user) {
		this.user = user;
	}
	
	public UserAndAccountDto(WalletUser user, WalletAccount account) {
		this.user=user;
		this.account=account;
	}
}
