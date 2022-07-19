package curs12.Homework;

public abstract class Account {
   private int accountNumber;
   public double balance;
   public Customer accountOwner;
   
  
    abstract void withdraw (double suma) throws InsufficientFundsException;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
