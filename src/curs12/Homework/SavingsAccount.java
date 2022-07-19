package curs12.Homework;

public class SavingsAccount extends Account{

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		setAccountNumber(accountNumber);
		super.balance=balance;
		super.accountOwner=accountOwner;
	}

	@Override
	void withdraw(double suma) throws InsufficientFundsException {
		
		   if (suma > balance) {
			  System.out.println("The  amount you entered is greater than the available balance :"+balance); 
			  System.out.println("Thank you for using our ATM!");
			throw new InsufficientFundsException();
		   } else {
			   balance= balance-suma;
			   System.out.println("Please pick your money!");
			   System.out.println("Your new balance is: " +balance);
			   System.out.println("Thank you for using our ATM!");
		   }
	
			
		}		
	}
