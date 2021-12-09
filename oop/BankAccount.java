package oop;

public class BankAccount {
	

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	
	public BankAccount() {
		this("0000", 0.0, "Default name", "default email", 00000000);
		System.out.println("Empty constructor called");

	}
	
	public BankAccount(String number, double balance, String customerName, String customerEmailAddress, int customerPhoneNumber) {
		
		System.out.println("Account constructor with parameters called");

		this.accountNumber = number;
		this.balance = balance;
		this.customerName = customerName;
		this.email = customerEmailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds( int deposit) {
		this.balance += deposit;
		System.out.println("Deposit of " + deposit  + " made. New balance is: " + this.balance);
	}
	
	public void withdrawFunds( double withdraw) {
		if( this.balance - withdraw < 0) {
			System.out.println("sorry you don't have enough cash " + "You have " + this.balance + " euros in account");
		}
		else {
			this.balance -= withdraw;
			System.out.println("Withdrawal of " + withdraw + "... Remaining balance of :" + " " + this.balance);
		}
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	


	


}
