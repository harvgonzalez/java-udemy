package oop;

public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount harvAccount = new BankAccount();
		BankAccount secondAccount = new BankAccount("1234", 0.0, "Javier Gonz", "jav@test.com", 24520421);
		
		harvAccount.setAccountNumber("234123409");
		harvAccount.setBalance(0);
		harvAccount.setCustomerName("Javier Gonzalez");
		harvAccount.setEmail("javier@test.com");
		
		
		harvAccount.depositFunds(1000);
		harvAccount.withdrawFunds(100);
		
		harvAccount.depositFunds(31);
		
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());
		
		VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
		System.out.println(customer2.getName());

		VipCustomer customer3 = new VipCustomer("Tim", 1.00, "test@tim.com");	
		
		
		System.out.println(customer3.getName());
	}

}
