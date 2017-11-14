package assignment04.managersystem._subclasses;

import java.util.UUID;

import assignment04.managersystem._superclasses.BankAccount;

/**
 * This is the sub class SavingAccount which uses a constructor
 * to set account number, balance and account type of a saving account.
 * 
 * @author: Christian Hall
 * @version: 1.0
 * @since: 2017-11-08
 *
 */

public class SavingAccount extends BankAccount {
	/**
	 * This is the constructor SavingAccount() which only uses
	 * the variables account number, balance and account type to be
	 * able to set account number, balance and account type of the
	 * saving account.
	 * 
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving Account");
		
	}

}
