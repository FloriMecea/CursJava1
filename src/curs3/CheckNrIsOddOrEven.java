package curs3;

import java.util.Scanner;

public class CheckNrIsOddOrEven {
	
	int number;
	
	
	/*
	 * Program care verifica daca un numar este par sau impar
	 * Daca numarul este par , atunci printeaza "Number is even!"
	 * Daca numarul este impar, atunci printeaza "Number is odd!"
	 * Numarul este dat dinamic (citit de la tastatura)
	 */

	//1 metoda care citeste numarul de la tastatura
	public void askTheUserForANumber() {
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
	}
	
	//2 care verifica daca numarul este par sau impar
	public void checkNumber() {
		
		// % --modulus 
		if(number % 2 == 0) {
			
			System.out.println("Number is even!");
			
		}else {
			
			System.out.println("Number is odd!");
		}
	}
}
