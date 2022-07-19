package curs12.Homework;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {
		
		Customer customer= new Customer("Dragos", "Craiova", "ionica@yahoo.com");
		SavingsAccount savingAccount= new  SavingsAccount (123456, 150, customer);
		
		System.out.println("Hi "+customer.getName());
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the amount to widraw:");
		double sum=scan.nextDouble();
		savingAccount.withdraw(sum);
	}

}
