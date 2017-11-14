package assignment04.managersystem._subclasses;

import java.util.UUID;

import assignment04.managersystem._superclasses.BankAccount;

/**
 * This is the sub class PersonalAccount which is using a constructor
 * and methods to set the account number, balance and account type of
 * a personal account.
 * 
 * @author: Christian Hall
 * @version: 1.0.
 * @since: 2017-11-08
 *
 */

public class PersonalAccount extends BankAccount {
	
	/**
	 * This is the constructor PersonalAccount() which only uses
	 * the variables account number, balance and account type to be
	 * able to set account number, balance and account type of the
	 * personal account.
	 * 
	 */
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(140.0);
		this.setAccountType("Personal Account");
		
	}

}
