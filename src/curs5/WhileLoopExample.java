package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Intrebam utilizatorul un numar
		 * Vom printa tabla inmultirii a acelui numar pana la 10
		 * 
		 * 
		 */
		System.out.println("Please enter a number");
		Scanner scan= new Scanner(System.in);
		int number=scan.nextInt();
		
		System.out.println("--- made with for---");
		for (int i=0; i<=10; i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
		
		
		System.out.println("--- made with while---");
		int x=0;
		while (x<=10) {
			
			System.out.println(number+"*"+x+"="+number*x);
			x++;
		}

	}

}
