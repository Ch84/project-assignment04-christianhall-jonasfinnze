package assignment04.managersystem._superclasses;

import java.util.UUID;

import assignment04.managersystem._interface.BankOperations;

/**This is the superclass where I have put all the methods and
 * constructors to calculate balance, withdraw and deposit.
 * 
 * @author: Christian Hall
 * @version: 1.0
 * @since: 2017-11-08
 *
 */


public class BankAccount implements BankOperations {
	/**This is the variables called accountNumber, accountType and
	 * balance. I have set account number to protected in order to reach
	 * it from another class file. Account type and balance is set to private
	 * because this is called encapsulation and needs to be done in order
	 * to package them and send away them to another class file.
	 * 
	 * {@code The code for this: protected String accountNumber, private String accountType
	 * and private double balance}
	 */
	protected String accountNumber = " ";
	private String accountType = " ";
	private double balance = 0.0;
	
	/**
	 * Variables for this is this.accountNumber, this.balance and
	 * this.accountType used to send in the values for account number,
	 * balance and account type.
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0.0;
		this.accountType = "Bank Account";
	}
	/**
	 * Parameters used is double amount used to be able to set the amount. 
	 * Also used if or else to
	 * compare how much amount is withdrawn from account.
	 * 
	 * @param withdrawMoney
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
			
		} else {
			System.out.println("You can not withdraw a negative value!");
		}
		
	}

	/**
	 * Parameters used is double amount used to be able to set the amount.
	 * Also used if or else to compare how much amount that is deposit to
	 * the actual account.
	 * 
	 * @param depositMoney
	 */
	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
			
		
			
		} else {
			System.out.println("You can not deposit a negative value!");
		}
		
	}
	/**
	 * This is returning the account number of the actual account.
	 * 
	 * @return accountNumber 
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Used as a parameter to set the number on the actual account.
	 * 
	 * @param setAccountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * This returns the account type.
	 * 
	 * @return accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * Used the parameter and account type to set what type of
	 * account that it is regarding.
	 * 
	 * @param setAccountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * This returns the balance value on the account.
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Used the parameter balance to set the balance on the account.
	 * 
	 * @param setBalance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * This returns a string with information on account number, 
	 * account type and the balance on the account.
	 * 
	 */
	public String toString() {
		return  "BankAccount [accountNumber = " + accountNumber + ", accountType = " + accountType + ", balance = " + balance
				+ "]";
	}
	
}
