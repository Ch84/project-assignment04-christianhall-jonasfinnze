package assignment04.managersystem._main;

import assignment04.managersystem._subclasses.BankCustomer;
import assignment04.managersystem._subclasses.PersonalAccount;
import assignment04.managersystem._subclasses.SavingAccount;
import assignment04.managersystem._superclasses.BankAccount;

/**This project is a bank system that shows the name and age of the 
 * the current customer and also what type of bank account it is 
 * regarding. It also shows further details of the account such as
 * account number, what type of account it is and also the current balance
 * on the account. This is the main class where I call upon my methods
 * from the interface, superclass's and all the subclasses.
 * 
 * @author Christian Hall
 * @version: 1.0
 * @since: 2017-11-08
 *
 */

public class Main {
	
	/**
	 * This is the main method which uses all the methods I call in order
	 * to print all the results on the details on the bank accounts.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String account = " ";
		
		//Constructor to call on all the methods below.
		BankCustomer bc = new BankCustomer("Christian Hall", 33);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		
		//Prints how much is the deposit to first account.
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("\nDepositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		//Prints how much is withdrawn from the first account.
		System.out.println("\nWithdrawing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
		
		//Prints how much deposit to first account.
		System.out.println("\nDepositing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}

}
