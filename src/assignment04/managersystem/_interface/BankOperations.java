package assignment04.managersystem._interface;

/**
 * This is the actual interface of the program.
 * 
 * @author: Christian Hall
 * @version: 1.0.
 * @since: 2017-11-08
 *
 */

public interface BankOperations {
	/**
	 * This constructor is using the method withdrawMoney to be able to see
	 * how much money that is withdrawn from the account.
	 * 
	 * @param amount
	 */
	public void withdrawMoney(double amount);
	
	/**
	 * This constructor is using the method depositMoney to be able to see
	 * how much money that is deposit to the account.
	 * 
	 * @param amount
	 */
	public void depositMoney(double amount);
}
