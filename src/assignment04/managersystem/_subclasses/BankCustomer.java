package assignment04.managersystem._subclasses;

import java.util.ArrayList;

import assignment04.managersystem._superclasses.BankAccount;
import assignment04.managersystem._superclasses.Human;

/**
 * This is the sub class BankCustomer which is returning a list 
 * with type of person, bank account, and account details.
 * 
 * @author: Christian Hall
 * @version: 1.0
 * @since: 2017-11-08
 *
 */

public class BankCustomer extends Human {
	/**
	 * The list that is used to print on the results.
	 * 
	 * {@code The code used is: ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();}
	 */
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	
	/**
	 * This is a constructor used to call on the name and age
	 * of the actual person from the super class Human 
	 * using the method super.
	 * 
	 * @param name
	 * @param age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
		
	}
	/**
	 * This is returning the list of all the actual customer accounts.
	 * 
	 * @return ArrayList
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	/**
	 * This is used to set the list of the actual customer account.
	 * 
	 * @param customerAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	/**
	 * This is used to add the actual bank account to the list.
	 * 
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		 this.customerAccounts.add(bankAccount);
		 
	}
	/**
	 * This is used to get what is the account number and amount of
	 * the actual account, and how much that is deposit to account.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int k = 0; k < customerAccounts.size(); k++) {
			if(customerAccounts.get(k).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(k).depositMoney(amount);
			}
		}
	}
	/**
	 * This is used to get what is the account number and amount of
	 * the actual account, and how much that is withdrawn from the
	 * account.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void withDrawMoneyFromAccount(String accountNumber, double amount) {
		for (int k = 0; k < customerAccounts.size(); k++) {
			if(customerAccounts.get(k).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(k).withdrawMoney(amount);
			}
		}
	}
	/**
	 * This is returning a string with information on what is the name and
	 * age of the actual person that is using the bank account.
	 * 
	 */
	public String toString() {
		String result = "Customer = " + getName()+", Age = "+ getAge()+"\n";
		for (int i = 0;i < customerAccounts.size();i++) {
			
			result += customerAccounts.get(i)+ "\n";
			
		}
		
		return result;
	}
	
		
}
