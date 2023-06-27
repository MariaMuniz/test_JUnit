package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import test.factory.AccountFactory;

public class AccountTests {
	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmpatyAccount();
		
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
	@Test
    public void depositShoulIdDoNothingWhenNegativeAmount() {
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		
		double amount = -200.0;
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
}

}
