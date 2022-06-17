package curs7;

import java.util.Scanner;

public class SwitchCalculator {
	
	/* facem un calc simplu pt operatiile de baza: +, -, *, /
	 * intrebam userul care este primul numar
	 * intrebam care este opearatia matematica
	 * intrebam care este numarul 2
	 * Printam rezultatul sub forma Ex: 2+2=4
	 * 
	 */
	

	
	//2 metoda pentru calcul
	int num1;
	int num2;
	char operation;
	int result;
	
	//masina  charAt -caracter la ..- pozitia caracterului din string
	//012345
	
	// 1 metoda pt a citi de la tastatura
	public void askTheUser() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the first number :");
		num1=scan.nextInt();
		
		System.out.println("Please enter the operation :");
		operation=scan.next().charAt(0);
		
		System.out.println("Please enter the second number :");
		num2=scan.nextInt();
		scan.close();
	}

	//2 metoda pentru calcul
	public void calculateValues() { //pentru string folosim = si nu ==

		
		/*
		 * if (operation == '+') { result=num1+num2; printResults(); } else if
		 * (operation == '-') { result=num1-num2; printResults(); } else if (operation
		 * == '*' || operation=='x') {
		 * 
		 * result=num1*num2; printResults(); } else if (operation== '/' || operation ==
		 * ':') {
		 * 
		 * result=num1/num2; printResults(); } else { System.out.
		 * println("Wrong operation! Please insert only: '+', '-','*', '/','+' "); }
		 */
		switch (operation) {
		case '+':
			result=num1+num2;
			printResults();
			break;
		case '-':
			result=num1-num2;
			printResults();
			break;
		case '*':				
			result=num1*num2;
			printResults();
			break;
		case '/':				
			result=num1/num2;
			printResults();
			break;
		default:
			System.out.println("Wrong operation! Please insert only: '+', '-','*', '/','+' ");
			
		}
		
	}
   
	public void printResults() {
		System.out.println(num1 + " "+ operation + " "+ num2 + "=" + result);
	
	}
}

