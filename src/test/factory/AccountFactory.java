package test.factory;

import entities.Account;

public class AccountFactory {
	
	public static Account createEmpatyAccount() {
		return new Account(1l, 0.0);
	}

	public static Account createAccount(double initialBalance) {
		return new Account(1l,initialBalance);
	}
}
